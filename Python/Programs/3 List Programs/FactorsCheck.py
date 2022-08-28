arr = list(map(int,input().split(',')))

for num in arr:
    fact = []

    if num == 0:
        continue
    elif num == 1:
        print('1')
        continue

    for i in range(1,num):
        if num%i==0:
            fact.append(i)
    if sum(fact) in arr:
        print(sum(fact))
    else:
        print('-1')

'''
For a given list of numbers find the its factors and add the factors
then if the sum of all factor is present in original list , sort it and
print it
Ex :
Input: 0,1,6
Factors 0 = 0 , sum =0
1=1 sum =1
6 =1,2,3 = sum =6
Output : 1,6
If the sum is not present in the list then return -1.
'''