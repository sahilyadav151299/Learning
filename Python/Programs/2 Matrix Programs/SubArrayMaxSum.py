n = int(input())

array = list(map(int,input().split()))

max_val = -1

for i in range(0,len(array)):
    for j in range(i+1,len(array)+1):
        
        sub = []
        
        for k in range(i,j):
            sub.append(array[k])
        
        add = sum(sub)
        
        if add > max_val :
            max_val = add

        
print(max_val)
