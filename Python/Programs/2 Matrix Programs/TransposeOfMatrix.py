r = 3
c = 3

matrix1 = []
matrix2 = [[0,0,0],[0,0,0],[0,0,0]]

print('Input values : ')

for i in range(3):
    row = list(map(int,input().split()))
    matrix1.append(row)

for rows in matrix1:
    print(rows)

for i in range(len(matrix1)):
    for j in range(len(matrix1[0])):

        matrix2[i][j] = matrix1[j][i]

print('Transpose Of Matrix : ')
for vals in matrix2:
    print(vals)