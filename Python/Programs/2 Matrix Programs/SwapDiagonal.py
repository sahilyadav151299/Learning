r,c = list(map(int,input('Row,Col : ').split(',')))

matrix = []

for i in range(r):
    row_val = list(map(int,input().split()))
    matrix.append(row_val)

print('Matrix : ')

for rows in matrix:
    print(rows)

l = len(matrix)

for i in range(l):
    matrix[i][i],matrix[i][l-i-1]=matrix[i][l-i-1],matrix[i][i]

print('\nAfter Swap : ')

for rows in matrix:
    print(rows)
