r,c = list(map(int,input('Row,Col : ').split(',')))

matrix = []

for row in range(r):
    col = list(map(int,input().split()))
    matrix.append(col)

print('Matrix : ')

for rows in matrix:
    print(rows)

count_zero = 0
non_zero = 0
values = r*c

for i in range(r):
    for j in range(c):
        if matrix[i][j] == 0:
            count_zero += 1
        else:
            non_zero += 1

if count_zero > values//2:
    print('Sparse Matrix')

'''
no. of zero > no. of element//2

n = 9
9//2 = 4
zero = 6
'''