#!/bin/bash
DIR=*
for FILE in $DIR
do
	if [ -f $FILE ];
	then
		sleep 1
		echo $FILE
	fi
done

