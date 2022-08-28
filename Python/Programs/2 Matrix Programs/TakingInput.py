row,col = list(map(int,input('Row,Col : ').split(',')))

matrix = []

for n in range(row):
    r = list(map(int,input().split()))
    matrix.append(r)

print(matrix)


for n in range(row):
    r = []
    for val in range(col):
        v = int(input('In R{} Val{} : '.format(n+1,val+1)))
        r.append(v)
    matrix.append(r)



print(matrix)