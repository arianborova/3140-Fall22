#!/usr/bin/bash.exe

today=`date +%j -d "today"`
lab1=`date +%j -d "09/28/2022"`
lab2=`date +%j -d "10/26/2022"`
lab3=`date +%j -d "11/23/2022"`
lab4=`date +%j -d "12/7/2022"`

#expr $lab2 - $lab4

echo Enter two of the dates from above
echo 1. Lab 1: Sep 28, 2022
echo 2. Lab 2: Oct 26, 2022
echo 3. Lab 3: November 23, 2022
echo 4. Lab 4: Dec 7, 2022
echo 5. Today

printf "\nEnter first date"
read var

if [ $var = 1 ]
then 
    d1=lab1 
elif [ $var = 2 ]
then
    d1=lab2
elif [ $var = 3 ]
then
   d1=lab3
elif [ $var = 4 ]
then
   d1=lab4
elif [ $var = 5 ]
then
   d1=today
fi

printf "\nEnter second date"
read var2

if [ $var2 = 1 ]
then
    d2=lab1
elif [ $var2 = 2 ]
then
    d2=lab2
elif [ $var2 = 3 ]
then
   d2=lab3
elif [ $var2 = 4 ]
then
   d2=lab4
elif [ $var2 = 5 ]
then
   d2=today
fi


DateComparison() {
   echo $(($1 - $2)) days
}

DateComparison d1 d2
