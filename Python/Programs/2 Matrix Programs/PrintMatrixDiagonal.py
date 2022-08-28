r,c = list(map(int,input('Row,Col : ').split(',')))

matrix = []

for row in range(r):
    col = list(map(int,input().split()))
    matrix.append(col)

print('Matrix : ')

for rows in matrix:
    print(rows)

print('Main Diagonals : ')

for i in range(len(matrix)):
    print(matrix[i][i],end=' ')

print('\nSecondary Diagonals : ')

for i in range(len(matrix)):
    print(matrix[i][len(matrix)-1-i],end=' ')