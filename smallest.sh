#!/bin/bash
smallest=3
for i in 5 2 19 8 7 3; do
  if [ $i -lt $smallest ]; then
     smallest=$i
  fi
done
echo $smallest

