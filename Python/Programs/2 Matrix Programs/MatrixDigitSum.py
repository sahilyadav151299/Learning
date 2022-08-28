def is_div(n):
    s = sum(list(map(int,str(n))))
    if n%s == 0:
        return True
    else:
        return False

row = int(input('Rows : '))
matrix = []

for i in range(row):
    matrix.append(list(map(int,input().split())))

col = len(matrix[0])

for r in range(row-1): # 0 1 2
    for c in range(col-1): # 0 1
        if is_div(matrix[r][c]) and is_div(matrix[r][c+1]) and is_div(matrix[r+1][c]) and is_div(matrix[r+1][c+1]):
            print(matrix[r][c],matrix[r][c+1])
            print(matrix[r+1][c], matrix[r+1][c])
            print()

'''
Find the all possible 2*2 matrix in which 
that each element of 2*2 matrix
should be divisible by sum of its digits.

4
42  54  2          O/P :  42 54   4 + 2 = 6 and 42%6 = 0  
30  24  27                30 24   5 + 4 = 9 and 54%9 = 0
180 190 40
11  121 13
'''