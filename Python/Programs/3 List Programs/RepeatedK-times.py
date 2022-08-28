n = int(input('No. of values : '))
num = list(map(int,input().split()))
k = int(input('Times : '))
count = [0]*100001

for i in num:
    count[i] += 1
for i in range(100002):
    if count[i] == k:
        print(i)
        break

'''
Given a list of N numbers a1,a2,a3.....an
You have to find the smallest number from the list
that is repeated in the list exactly k number of times

I/P  :  5                O/P : 1
        2 2 1 3 1
        2
'''