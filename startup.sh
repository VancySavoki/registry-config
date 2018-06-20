#!/bin/bash
FILE_PATH=`dirname $0`
PROJECT_REAL_PATH=`realpath $FILE_PATH`
MAIN_MODULE=registry
GRADLE_EXEC=`which gradle`
if [[ $? != 0 ]];then
   echo 'gradle not found in $PATH'
   exit -1
else
   $GRADLE_EXEC run -x test -b $PROJECT_REAL_PATH/$MAIN_MODULE/build.gradle
   #$GRADLE_EXEC :$MAIN_MODULE:run
fi
exit
