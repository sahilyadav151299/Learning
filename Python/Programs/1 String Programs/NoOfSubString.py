string = input()
lst = string.split(',')
string = lst[0]
ch = lst[1]
sub = string.split(ch)
total_sub = 0

for s in sub:
    l = len(s)
    total_sub += (l*(l+1))/2

print(int(total_sub))


'''
Given a string and a special character separated with comma.
Find the total number of substring in which special character did not present.

abcd,b   a*    b   c*  d*                 ,b is spacial number
         ab    bc  cd*
         abc   bcd
         abcd
         
Formula : n(n+1)/2  total sbustring   


string = input()
lst = string.split(',')
st = lst[0]
ch = lst[1]
count = 0

for i in range(len(st)):
    for j in range(i+1,len(st)+1):
        sub = st[i:j]
        print(sub)
        if ch in sub:
            pass
        else:
            count += 1     
'''