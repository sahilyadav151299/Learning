r,c = list(map(int,input('R,C : ').split(',')))
matrix1 = []
matrix2 = [[0,0,0],[0,0,0],[0,0,0]]

for n in range(r):
    r_val = list(map(int,input().split()))
    matrix1.append(r_val)

print('Original Matrix : ')
for val in matrix1:
    print(val)

for i in range(len(matrix1)):
    for j in range(len(matrix1[0])):
        matrix2[j][i] = matrix1[i][j]

print('Transpose Matrix : ')
for val in matrix2:
    print(val)
f = 0
for i in range(r):
    for j in range(c):
        if matrix1[i][j] != matrix2[i][j]:
            f = 1
            break

if f == 1:
    print('Non Symmetric')
else:
    print('Symmetric')


    for i in range(r):
        for j in range(c):
            matrix2[i][j] = matrix2[i][j]*(-1)
    c = 0
    for i in range(r):
        for j in range(c):
            if matrix2[i][j] != matrix1[i][j]:
                c = 1
                break

    if c == 0:
        print('Skew Symmetric matrix')
    else:
        print('Only Symmetric Matrix')
'''
1) Transpose of matrix
2) Mul with '-'
3) If same as Original
4) Skew Symmetric Matrix
'''