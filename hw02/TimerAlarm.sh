#!/bin/bash
echo "Timer: "
read TIME
if [[ -n $TIME && 0 -lt $TIME ]];
then
	for i in $(seq 1 $TIME)
	do
		sleep 1
		echo $((TIME-i))
	done
	echo 
	echo 
	echo 
	echo 
	echo 
fi
