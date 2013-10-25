#!/bin/bash
echo "(1) Copy SRC_FILE to TARGET_DIR"
echo ""

echo "1. Type SRC_FILE Directory"
read SRC_FILE

if [ -f $SRC_FILE ]; then
	echo ""
else
	if [ -d $SRC_FILE ]; then
		echo "${SRC_FILE} is a Directory"
	else
		echo "${SRC_FILE} is not Exist"
	fi
	exit 1
fi

echo "2. Type TARGET_DIR"
read TARGET_DIR

if [ -d $TARGET_DIR ]; then
	cp ${SRC_FILE} ${TARGET_DIR}
	echo "Copy Success"
else
	echo "${TARGET_DIR} is not a Directory"
	exit 1	
fi
