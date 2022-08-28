import re
string = input()
digit = re.findall('\d',string)
final = ''
if string[0] == '-':
    final = '-'
while digit[0] == '0':
    digit.pop(0)
for n in digit:
    final += ''.join(n)
print(final)            


'''
Given a string as '-00a45d84sd54'.
Extract the no from it. EX -458454
'''
















