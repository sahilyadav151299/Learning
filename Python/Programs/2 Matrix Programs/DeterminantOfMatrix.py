r,c = list(map(int,input('Row,Col : ').split(',')))
matrix = []

for i in range(r):
    row_val = list(map(int,input().split()))
    matrix.append(row_val)

print('Matrix : ')

for rows in matrix:
    print(rows)

first = 1
second = 1

for i in range(r):
    first *= matrix[i][i]
    second *= matrix[r-i-1][i]

print('Ans :',first-second)