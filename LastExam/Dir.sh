#!/bin/bash
echo "(2) Get DIR and DIR/FILE, then print FILE's Directory"
echo ""

echo "1. Type DIR"
read DIR

if [ -d $DIR ]; then
	cd ${DIR}
else
	if [ -f $DIR ]; then
		echo "${DIR} is a File"
	else
		echo "${DIR} is not Exist"
	fi
	exit 1
fi

echo "2. Type FILE"
read FILE

if [ -f $FILE ]; then
	pwd
else
	if [ -d $FILE ]; then
		echo "${FILE} is a Directory"
	else
		echo "${FILE} is not Exist"
	fi
	exit 1
fi
