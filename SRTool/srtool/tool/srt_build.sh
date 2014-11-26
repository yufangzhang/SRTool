#!/bin/bash

# You should assume that TOOL_DIR is set to the directory of srt_build.sh.

: ${TOOL_DIR:?"Need to set TOOL_DIR environment variable."}
javac -target 1.6 -source 1.6 -cp $TOOL_DIR/src:$TOOL_DIR/junit-4.10.jar:$TOOL_DIR/antlr-3.4-complete.jar:$TOOL_DIR/jcommander.jar -d $TOOL_DIR/bin -s $TOOL_DIR/bin $TOOL_DIR/src/srt/*/*.java $TOOL_DIR/src/srt/*/*/*.java $TOOL_DIR/src/srt/*/*/*/*.java

