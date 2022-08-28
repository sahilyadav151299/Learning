string = input()

# op 'd1c2b3a4'

st = ''
num = []

for i in range(len(string)):
    try:
        n = int(string[i])
        num.append((str(n),i))
    except:
        st = st + string[i]
        
St = list(st[::-1])      
        
for d,p in num:
    St.insert(p,d)
            
    
print(''.join(St))
