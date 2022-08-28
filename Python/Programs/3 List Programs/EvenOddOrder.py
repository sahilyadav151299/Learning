import re

raw = input()
even = []
odd = []

data = re.findall('\d',raw)

for d in data:
    if int(d)%2==0:
        even.append(d)
    else:
        odd.append(d)

if len(raw)%2==0:
    if len(even)>len(odd):
        for i in range(len(odd)):
            print('{}{}'.format(even[i],odd[i]),end='')
        for i in range(len(odd),len(even)):
            print('{}'.format(even[i]),end='')
    else:
        for i in range(len(even)):
            print('{}{}'.format(even[i],odd[i]),end='')
        for i in range(len(even),len(odd)):
            print('{}'.format(odd[i]),end='')

else:
    if len(even)>len(odd):
        for i in range(len(odd)):
            print('{}{}'.format(odd[i],even[i]),end='')
        for i in range(len(odd),len(even)):
            print('{}'.format(even[i]),end='')
    else:
        for i in range(len(even)):
            print('{}{}'.format(odd[i],even[i]),end='')
        for i in range(len(even),len(odd)):
            print('{}'.format(odd[i]),end='')

'''
input:- Asp5w8w@k7!l23mn69
Output:- 8527639
As num of spl characters in the given string is even so we should
print first even digits and
next odd digits in the same series present in the string
Input:-
#bn7856!@kn2n65jbnj482375
Output:-
7856523674582
As count of spl characters in the given string is odd so we should
first print odd digits and
then even digits in the same series present in the string
'''