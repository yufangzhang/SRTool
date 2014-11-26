#!/bin/bash

# You should assume that TOOL_DIR is set to the directory of srt_build.sh.
# You should NOT "cd $TOOL_DIR".

: ${TOOL_DIR:?"Need to set TOOL_DIR environment variable."}

java -Xss40M -cp $TOOL_DIR/bin:$TOOL_DIR/jcommander.jar:$TOOL_DIR/antlr-3.4-complete.jar srt.tool.Main "$@"

