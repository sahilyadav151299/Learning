n = int(input())
arr = list(map(int,input().split(',')))

for i in range(n):
    arr.pop(0)

num = [0]*1000

for i in range(len(arr)):
    num[arr[i]]+=1

count = 0

for i in num:
    if i!=0:
        count+=1
print(count)


'''
N and an array where 0<N<len(Array)
Ex : N=2
Array =1,2,3,3,4,4
O/p :
To find the least number of unique elements after deleting N
numbers of elements of numbers in the array
In the above ex , after deleting N=2 number of elements from the
array
In above 1,2 should be deleted
3,3,4,4 will be remaining so,
2 unique elements from the array
So ,output in should be 2
'''