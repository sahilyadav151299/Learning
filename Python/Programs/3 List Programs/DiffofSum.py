num = list(map(int,input()))

even = 0
odd = 0
for i in range(len(num)):
    if i%2==0:
        odd += num[i]
    else:
        even += num[i]


print(abs(even-odd))

'''
Find difference between sum of even & sum of odd position digits:

Ex: 4567

4+6=10
5+7=12
12-10=2
'''