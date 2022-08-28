row,col = map(int,input().split(' '))
l_digit = []
matrix = []

for r in range(row):
    row_val = list(map(int,input().split()))
    matrix.append(row_val)

for r in range(0,row):
    for c in range(0,col):
        if c < col-3:
            if matrix[r][c] == matrix[r][c+1] == matrix[r][c+2] == matrix[r][c+3]:
                l_digit.append(matrix[r][c])

            if matrix[r][c] == matrix[r+1][c] == matrix[r+2][c] == matrix[r+3][c]:
                 l_digit.append(matrix[r][c])

            if c < col-3 and r >= 3:
                if matrix[r][c] == matrix[r-1][c+1] == matrix[r-2][c+2] == matrix[r-3][c+3]:
                    l_digit.append(matrix[r][c])

            if c >= 3 and r >= 3:
                if matrix[r][c] == matrix[r-1][c-1] == matrix[r-2][c-2] == matrix[r-3][c-3]:
                    l_digit.append(matrix[r][c])

if len(l_digit) == 0:
    print('-1')
else:
    print(min(l_digit))

'''
Input a matrix.
Check if do we get the same no consecutively at least 4 times 
in any fashion (vertical, horizontal, diagonal). Record those sets.
If we get multiple consecutive num then print min of them.
If we get such no consecutive number then print -1

6 6
1 3 3 3 3 9
1 6 9 2 3 9
1 2 2 5 4 9
2 2 4 5 7 9 
2 4 5 6 7 2

sets we get here 
[3 3 3 3] horizontaly
[9 9 9 9] vertically
[2 2 2 2] diagonally
print 2 here
'''