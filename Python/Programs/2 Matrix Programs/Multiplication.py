r,c = list(map(int,input('R,C : ').split(',')))
matrix1 = []
matrix2 = []
matrix3 = [

    [0,0,0],
    [0,0,0],
    [0,0,0]
]
print('Matrix 1 values : ')
for n in range(r):
    r_val = list(map(int,input().split()))
    matrix1.append(r_val)

print(matrix1)

print('Matrix 2 values : ')
for n in range(r):
    r_val = list(map(int,input().split()))
    matrix2.append(r_val)

print(matrix2)

print('Multiplication of them : ')

for i in range(len(matrix1)):
    for j in range(len(matrix2[0])):
        for k in range(len(matrix2)):
            matrix3[i][j] += matrix1[i][k] * matrix2[k][j]


for val in matrix3:
    print(val)










