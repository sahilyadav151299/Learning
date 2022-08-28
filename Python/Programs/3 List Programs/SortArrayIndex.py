t = int(input('Test Cases : '))

while t != 0:
    n = int(input('No. of input : '))
    num = list(map(int,input().split()))
    l1 = num.copy()
    l1.sort()

    data = {}

    for i in range(n):
        data[l1[i]] = i

    for j in range(n):
        print(data[num[j]],end = ' ')


    t -= 1


'''
I/P : 5 10 40 30 20
      0  1  2  3  4
      
O/P : 0  1  4  3  2
'''