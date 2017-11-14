echo "Enter name of the student"
read name
echo "enter roll number"
read num
echo "Enter the marks of the student"
read m1 m2 m3 m4 m5
echo "Name of the student is $name"
echo "number of the student is $num"
echo "marks obtained"
echo "m1 m2 m3 m4 m5"
echo $m1 $m2 $m3 $m4 $m5
per=`echo \($m1 + $m2 + $m3 + $m4 + $m5\) /5|bc`
echo Percentage is $per
if test $per -ge 60
then
echo "Grade:first"
elif test $per -ge 50 -a $per -le 59
then
echo "grade:second"
elif test $per -ge 40 -a $per -le 49
then
echo "grade:third"
else
echo "fail"
fi
