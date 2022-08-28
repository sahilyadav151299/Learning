r,c = input().split()

row = int(r)
col = int(c)

matrix = []

for i in range(row):
    val = list(map(int,input().split()))
    matrix.append(val)


for i in range(0,col):
    for j in range(row-1,-1,-1):
        print(matrix[j][i], end=' ')
    print('')   
