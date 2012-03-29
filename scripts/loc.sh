#!/bin/sh

PROJ_NAME="RPG-Character-Sheets"
PROJ_NAME_TEST="${PROJ_NAME}-Test"

PROJ_DIR="./${PROJ_NAME}/src"
TEST_DIR="./${PROJ_NAME_TEST}/src"
RES_DIR="./${PROJ_NAME}/res"

PROJ_LOC=`find $PROJ_DIR -type f -name *.java -exec cat {} \; | nl | tail -1 | awk '{ print $1 }'`
TEST_LOC=`find $TEST_DIR -type f -name *.java -exec cat {} \; | nl | tail -1 | awk '{ print $1 }'`
RES_LOC=`find $RES_DIR -type f -name *.xml -exec cat {} \; | nl | tail -1 | awk '{ print $1 }'`

echo "$PROJ_LOC \t- $PROJ_NAME"
echo "$TEST_LOC \t- $PROJ_NAME_TEST"
echo "$RES_LOC  \t- res/"
echo "$(($PROJ_LOC + $TEST_LOC + $RES_LOC)) \t- Total"
