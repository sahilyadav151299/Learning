r,c = list(map(int,input('Row,Col : ').split(',')))
matrix = []

for i in range(r):
    row_val = list(map(int,input().split()))
    matrix.append(row_val)

print('Original Matrix : ')

for rows in matrix:
    print(rows)

print('Mirror Matrix :')

for i in range(r):
    for j in range(c):
        print(matrix[i][c-1-j],end= ' ')
    print(' ')