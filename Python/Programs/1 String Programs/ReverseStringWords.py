t = int(input('Enter test cases : '))

while t>0:
    s = input('String : ')
    l = list(s.split('.'))
    l.reverse()
    print('.'.join(l))
    t -= 1

'''
Reverse words in a string 
I/P : pqr.mno
O/P : mno.pqr
'''
