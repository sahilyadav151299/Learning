import re
string = input('Enter : ')

l = re.findall('[a-zA-Z]',string)
l.reverse()

for i in range(len(string)):
    if string[i] == '#' or string[i] == '@':
        l.insert(i,string[i])

print(''.join(l))

'''
I/P : h@llo
O/P : o@llh  
'''
