r,c = list(map(int,input('R,C : ').split(',')))
matrix1 = []
matrix2 = []
matrix3 = []

print('Matrix 1 values : ')
for n in range(r):
    r_val = list(map(int,input().split()))
    matrix1.append(r_val)

print('Matrix 2 values : ')
for n in range(r):
    r_val = list(map(int,input().split()))
    matrix2.append(r_val)

print('Addition of them : ')

for rows in range(c):
    r_val = []
    for cols in range(r):
        val = matrix1[rows][cols] + matrix2[rows][cols]
        r_val.append(val)
    matrix3.append(r_val)

for row in matrix3:
    print(row)