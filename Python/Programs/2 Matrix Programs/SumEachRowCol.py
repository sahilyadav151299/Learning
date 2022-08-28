r,c = list(map(int,input('Row,Col : ').split(',')))

matrix = []

for row in range(r):
    col = list(map(int,input().split()))
    matrix.append(col)

print('Matrix : ')

for rows in matrix:
    print(rows)

row = []
col = []

for i in range(len(matrix)):
    row_sum = 0
    col_sum = 0
    for j in range(len(matrix[0])):
        row_sum += matrix[i][j]
        col_sum += matrix[j][i]

    row.append(row_sum)
    col.append(col_sum)

print('Row Sum :',row)
print('Col Sum :',col)

