arr = list(map(int,input().split(',')))
arr = sorted(arr)
brr = []
brr.append(arr[0])
brr.append(arr[1])

for i in range(2,len(arr)):
    if (brr[i-1]+brr[i-2]) in arr:
        brr.append(brr[i-1]+brr[i-2])
    else:
        break
print(brr)

'''
An array is given suppose a =[3,5,8,2,19,12,7,11]
One have to find the largest subarray that the element satisfy the
following condition x[i]=x[i-1]+x[i-2]
If more than one substring if found then largets one has to print
the array which starts with the minimum elements and if they are
also same then the array with minimum second element and so
on .
Here the subarrays [2,3,5,8] ,[3,8,11],[5,7,12,19]
Expected is [2,3,5,8]
'''