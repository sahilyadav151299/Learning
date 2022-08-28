import itertools

arr = list(map(int,input().split(',')))
chk = int(input())
count = 0
lst = list(itertools.combinations(arr,4))

for val in lst:
    if sum(val)==0:
        print(val)
        count += 1

print(count)

'''
Set of number given and the sum is given
-1 , 1, 0,0,2,-2
Sum=0
Output should be combination of which satisfy the case
(-1,1,2,-2)(0,0,1,-1)(0,0,-2,2)
Output : 3
'''