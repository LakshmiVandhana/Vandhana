#!/bin/bash
if grep "Linux" linuxfilesystem.txt >/d/null
then
echo Linux occurs in myfile
else
 echo no!
 echo Linux does not occur in myfile
fi
