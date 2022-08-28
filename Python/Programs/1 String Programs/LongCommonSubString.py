t = int(input())

while t != 0 :
    n1,n2 = list(map(int,input().split()))
    string1 = input()
    string2 = input()
    com_sub = 0
    for i in range(n1):
        for x in range(i+1,n1+1):
            s = str(string1[i:x])
            l = len(s)
            if s in string2:
                if l > com_sub:
                    com_sub = l

    print(com_sub)

    t -= 1

'''
1
6 6
ABCDGH
ACDGHR
4
'''