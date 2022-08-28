r,c = list(map(int,input('Row,Col : ').split(',')))

matrix = []

for row in range(r):
    col = list(map(int,input().split()))
    matrix.append(col)

for rows in matrix:
    print(rows)

print('Lower Triangal : ')

for i in range(len(matrix)):
    for j in range(len(matrix[0])):
        if i>j:
            print(matrix[i][j],end=' ')

print('\nUpper Triangal : ')

for i in range(len(matrix)):
    for j in range(len(matrix[0])):
        if i<j:
            print(matrix[i][j],end=' ')