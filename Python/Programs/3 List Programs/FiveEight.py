num = input().split(',')

idx1 = num.index('5')
idx2 = num.index('8')

case1 = list(map(int,num[:idx1]+num[idx2+1:]))
case1 = sum(case1)
print(case1)

case2 = int(''.join(num[idx1:idx2+1]))
print(case2)

print(case1+case2)

'''
Input : a string of comma separated numbers.
The numbers 5 and 8 are present in the list
Assume that 8 always comes after 5.
Case 1: num1 = add all numbers which do not lie between 5 and
8 in the input.
Case 2 : num2= numbers formed by concatenating all numbers
from 5 to 8 .
Output: sum of num1 and num2
Example: 1)3,2,6,5,1,4,8,9
Num1:3+2+6+9 =20
Num2:5148
O/p=5248+20 = 5168
'''