import string
lower = string.ascii_lowercase
st = input()
data = ''

for ch in st:
    if ch not in lower:
        data+=ch

l = 0
sub = ''
for i in range(len(data)):
    for j in range(i+1,len(data)+1):
        s = data[i:j]
        if len(s)>l and len(s)>len(sub):
            sub = s
            l = len(s)

print(sub)

'''
Find the largest substring
Input : A@B@C1bba
Output:A@B@C1
Substrings are :
A->A@B@C1
@->@b@C1
B->B@C1
@->C1
Since first substring has largest length it will print
'''
