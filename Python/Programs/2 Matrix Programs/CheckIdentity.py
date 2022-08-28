r,c = list(map(int,input('R,C : ').split(',')))

matrix = []

for i in range(r):
    row_val = list(map(int,input().split()))
    matrix.append(row_val)

print('Matrix : ')

for rows in matrix:
    print(rows)

for i in range(len(matrix)):
    s = 0
    for j in range(len(matrix[0])):
        s += matrix[i][j]

    if matrix[i][i] == 1 and s == 1:
        continue
    else:
        print('Matrix is not Identity Matrix...!!!')
        break

else:
    print('True')