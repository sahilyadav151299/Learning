def pronic(check):
    for i in range(1,(check//2)+1):
        if i*(i+1)==check:
            return 1

    return 0

num = input()
pronics = []

for i in range(len(num)):
    for j in range(i+1,len(num)+1):
        sub = int(num[i:j])
        res = pronic(sub)
        if res == 1:
            pronics.append(sub)

pronics = list(set(pronics))
pronics.sort()
for n in pronics:
    print(n,end=' ')

'''
Input:- 93012630
Output:- 2,6,12,30,930,
We should divide the total number into substrings and we should
verify each num is pronic num or
not if pronic we should print that num
Pronic: means it is a multiple of two consecutive integers
Ex: 6->2*3 it’s a pronic
12->3*4 it’s a pronic
Input: 12665042
Output:- 2,6,12,42,650
'''