bkts = list(input())
stack = []
count = 0
flag = 0
for b in bkts:
    if b=='(' or b=='{' or b=='[':
        stack.append(b)
        count += 1
        continue

    if len(stack)==0:
        count += 1
        break

    x = stack.pop()
    if x=='(' and b==')':
        count+=1
    elif x=='{' and b=='}':
        count+=1
    elif x=='[' and b==']':
        count+=1
    else:
        count+=1
        flag = 1
        break

if len(stack)==0:
    count = 0
elif len(stack)!=0 and flag==0:
    count += 1
else:
    count = count

print(count)

'''
if len(stack)==0:
    print('0')
elif len(stack)!=0 and count == len(bkt):
    print(count+1)
else:
    print(count)

'''
'''
A non empty string instr containing only parenthesis (,),{.},[,] it
return outstr based on following,
- instr is properly nested and return 0
- instr not properly nested ,return position of element in instr
-position start from 1
Input : {([])}[] output : 0
Input : ([)()] output :3
Input :[[()] output:n+1 for last element i.e 5+1 =6
'''