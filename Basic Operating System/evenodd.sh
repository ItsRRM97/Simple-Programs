echo “Enter Upper limit”

read n

$i = 2

while [$i -lt $n]

do

echo $i

expr ‘$i=$i+2’

done
