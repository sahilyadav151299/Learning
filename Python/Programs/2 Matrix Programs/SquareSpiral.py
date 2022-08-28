r,c = input().split()

row = int(r)
col = int(c)

matrix = []

for i in range(row):
    val = list(map(int,input().split()))
    matrix.append(val)    


start_0 = -1
end_0 = col

start_1 = 0
end_1 = row

start_2 = col-1
end_2 = -1

start_3 = row-1
end_3 = 0

n = col
k = row
x = -1

count = 0
temp = 0

if row%2 == 0:
    temp = row//2
else:
    temp = (row//2)+1
    
 
for i in range(0,temp):
    start_0 += 1
    end_0 -= 1
    for j in range(start_0,end_0+1):
        print(matrix[i][j], end = ' ')

    start_1 += 1
    end_1 -= 1
    n -= 1
    count += 1
    if count == temp and temp == (row//2)+1:
        break
    
    for m in range(start_1,end_1+1):
       print(matrix[m][n], end = ' ')
    
    start_2 -= 1
    end_2 += 1
    k -= 1
    
    for l in range(start_2,end_2-1,-1):
        print(matrix[k][l], end = ' ')

    start_3 -= 1
    end_3 += 1
    x += 1        
    
    for y in range(start_3,end_3-1,-1):
        print(matrix[y][x], end = ' ')

    










        
