size = int(input())
arr = list(map(int,input().split()))
sticks = []
sticks.append(len(arr))
while len(arr)!=0:
    brr = []
    m = min(arr)

    for i in range(len(arr)):
        a = arr[i]-m
        if a!=0:
            brr.append(a)
    arr.clear()
    arr = brr
    sticks.append(len(arr))


print(sticks)


'''
Given size of arry = 6

Values : 5 4 4 2 2 8

sticks len      len of cut     stick count
5 4 4 2 2 8     min = 2            6
3 2 2 _ _ 6     min = 2            4
1 _ _ _ _ 4     min = 1            2
_ _ _ _ _ 3     min = 3            1
_ _ _ _ _ _     min = 0            0

OP : 6 4 2 1 0
'''


