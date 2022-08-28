row = int(input())

mat = []

for i in range(row):
    mat.append(list(map(int,input().split())))

for i in range(row-1):
    for j in range(len(mat[0])-1):
        a = mat[i][j]
        b = mat[i][j+1]
        c = mat[i+1][j]
        d = mat[i+1][j+1]

        if a%sum(list(map(int,str(a))))==0 and b%sum(list(map(int,str(b))))==0 and c%sum(list(map(int,str(c))))==0 and d%sum(list(map(int,str(d))))==0:
            print('{} {}'.format(a,b))
            print('{} {}'.format(c,d))
            print('')
'''
Find the all possible 2*2 matrix whose each should
Follow rule that each element of 2*2 matrix should be divisible by
sum of its digits.
Ex :
N=4
42 54 2
30 24 27
180 190 40
11 121 13

O/p:
42 54
30 24

30 24
180 190

24 27
190 40
'''