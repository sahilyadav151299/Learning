string = list('HeLloOWorLDd')
ch_lst = []

for i in range(len(string)):
    if string[i] == '':
        continue
    ch_grp = string[i]
    for j in range(i+1,len(string)):
        if str(string[i]).lower() == str(string[j]).lower():
            ch_grp += string[j]
            string[j] = ''

    string[i] = ''           # to remove repeatition
    ch_lst.append(ch_grp)

print(ch_lst)

for i in range(len(ch_lst)):
    for j in range(i+1,len(ch_lst)):
        if ch_lst[i].lower() > ch_lst[j].lower():
            ch_lst[i],ch_lst[j] = ch_lst[j],ch_lst[i]
print(ch_lst)
l = len(ch_lst)

for i in range(l//2):
    print(ch_lst[i]+ch_lst[l-i-1],end='')

if l%2 != 0:
    print(ch_lst[l//2])

'''
Given 'HeLloOWorLDd'
Form group of characters
D : Dd
L : LiL
H : H
O : oOo and so on
Arrange these in ascending orders

Then print 1 group from asd folowed by last group in dsd

O/P : DdWerHoOoLlL

'''







