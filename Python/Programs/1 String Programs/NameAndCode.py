string = input('Enter : ')
data = []
final = ''

data = string.split(',')

for i in data:
    temp = i.split(':')
    name = temp[0]
    code = temp[1]
    length = len(name)
    max = 0
    for digit in code:
        if int(digit) <= length:
            if max < int(digit):
                max = int(digit)

    if max == 0:
        final += 'X'
    else:
        final += name[max-1]

print(final)

'''
Take input from user in the given format [Name : Code]
Find max digit from the code which is less or equal to the len of Name &
Put that place char in final string 
If there in no digit at that place than put 'X'

I/P : Abhishek:34848, Mayur:4739, Friends:2949, Yeah:9889
O/P : kueX
'''