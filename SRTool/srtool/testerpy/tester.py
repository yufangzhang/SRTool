#!/usr/bin/python
# encoding: utf-8


import os
import sys
import subprocess
from os import path
import errno
from shutil import copy2
import shutil
import threading
import re
import time
import signal


class TestTimeoutException(Exception):
    pass

class TestNotGoodOrBadException(Exception):
    pass

class Command(object):
    def __init__(self, cmd):
        self.cmd = cmd
        self.process = None
        self.stdout = ""
        self.stderr = ""

    def run(self, timeout):
        def target():
            self.process = subprocess.Popen(self.cmd, stdout=subprocess.PIPE, preexec_fn=os.setsid)
            self.stdout, self.stderr = self.process.communicate()
        thread = threading.Thread(target=target)
        try:
            thread.start()
            thread.join(timeout)
        except:
            if thread.is_alive():
                print ' Interrupted'
                try:
                    os.killpg(self.process.pid, signal.SIGINT)
                    time.sleep(2)
                    os.killpg(self.process.pid, signal.SIGKILL)
                except:
                    pass
                thread.join()
                raise
        if thread.is_alive():
            print ' Timeout'
            try:
                os.killpg(self.process.pid, signal.SIGINT)
                time.sleep(2)
                os.killpg(self.process.pid, signal.SIGKILL)
            except:
                pass
            thread.join()
            raise TestTimeoutException()
        return self.process.returncode

print "\nRunning tester: \"" + "\" \"".join(sys.argv) + "\""

myname = sys.argv.pop(0)
tool = sys.argv.pop(0)
testsdir = sys.argv.pop(0)
onlyReportFailures = sys.argv.pop(0)


nullout = open(os.devnull, 'w')
out = sys.stdout
failureOut = nullout

UNKNOWN = "unknown"
CORRECT = "correct"
INCORRECT = "incorrect"

if onlyReportFailures == "1":
    out = nullout
    failureOut = sys.stdout

testsPassed = 0
testsFailed = 0
points = 0
maxPoints = 0

startTime = time.time()

for root, dirs, files in os.walk(top=testsdir):
    for testfilebasename in [x for x in files if x.endswith(".sc")]:
        testfile = root + os.sep + testfilebasename
        args = [tool, testfile] + sys.argv
        out.write("\n\n"+" ".join(args)+"\n")
        result = UNKNOWN
        expected = UNKNOWN
        if testfile.find("_good") != -1:
            expected = CORRECT
        elif testfile.find("_bad") != -1:
            expected = INCORRECT
        else:
            raise TestNotGoodOrBadException()
        
        out.write(testfile+"\n")
        
        cmd = Command(args)
        try:
            cmd.run(60)
            cmd.stdout = cmd.stdout.strip()
            if cmd.stdout.endswith(INCORRECT):
                result = INCORRECT
            elif cmd.stdout.endswith(CORRECT):
                result = CORRECT
        except TestTimeoutException:
            sys.stdout.write("Timeout!\n")
        out.write("Tool result:     " + result+"\n")
        out.write("Expected result: " + expected+"\n")
        
        if result != expected:
            failureOut.write("\n--FAILURE------\n")
            failureOut.write(" ".join(args)+"\n")
            failureOut.write("Tool result:     " + result+"\n")
            failureOut.write("Expected result: " + expected+"\n")
        
        pointsAdded = 0
        
        if result == UNKNOWN:
            testsFailed+=1
        elif result == INCORRECT:
            if result == expected:
                pointsAdded = 1
                testsPassed+=1
            else:
                pointsAdded = -4
                testsFailed+=1
        elif result == CORRECT:
            if result == expected:
                pointsAdded = 2
                testsPassed+=1
            else:
                pointsAdded = -8
                testsFailed+=1
        else:
            assert False
        
        points += pointsAdded
        out.write("Points added: " + str(pointsAdded)+"\n")
        
        if expected == CORRECT:
            maxPoints += 2
        else:
            assert expected==INCORRECT
            maxPoints += 1
        

endTime=time.time()
sys.stdout.write("\n--------------\n")
sys.stdout.write("--------------\n")
sys.stdout.write("# passed     " + str(testsPassed) + "\n")
sys.stdout.write("# tests      " + str(testsPassed + testsFailed) + "\n")
sys.stdout.write("--------------\n")
sys.stdout.write("# points:       " + str(points) + "\n")
sys.stdout.write("(max possible): " + str(maxPoints) + "\n")
sys.stdout.write("--------------\n")
sys.stdout.write("time: " + str(endTime-startTime) + " seconds\n")
















































