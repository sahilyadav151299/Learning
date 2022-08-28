string = input()
l = len(string)
unique = ''

for i in range(l):
    substring = string[i]
    for j in range(i+1,l):
        substring += string[j]
        sub_len = len(substring)
        if sub_len >= 3 and len(set(substring)) == sub_len:
            if len(unique) < sub_len:
                unique = substring

if len(unique) == 0:
    print('-1')
else:
    print(unique)

'''
Find longest sub string in a string of uinque char i.e. case-sensitive
Min length = 3
If same len print 1st one
If no len 3 print -1

I/P : abAca
O/P : abAc
'''