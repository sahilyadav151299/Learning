fraction = list(map(int,input().split('/')))

num = fraction[0]
den = fraction[1]
flag = 0
if (num/den) < 1:
    gcd = 0

    for i in range(1,num+1):
        if num%i==0 and den%i==0:
            gcd = i

    if gcd == 1:
        mul = num*den
        i = 1
        while mul!=1:
            if mul%i==0:
                mul = mul//i
                i += 1
            else:
                flag = -1
                break
    else:
        flag = -1

else:
    flag = -1

if flag == 0:
    print('YES')
else:
    print('NO')


'''
Find a proper fraction that stisfy the property

1) Value is < 1
2) The gcd of numerator & denomirator is 1
3) Product of num & den is factorial of N 
'''

