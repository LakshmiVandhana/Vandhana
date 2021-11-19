#!/bin/bash
if grep "Linux" linuxfilesystem.txt >/d/null
then
  echo "Linux occurs in linuxfilesystem"
elif grep "Unix" linuxfilesystem.txt >dev/null
then
  echo "Linux does not occur but Unix does"
else
  echo "nobody is there"
