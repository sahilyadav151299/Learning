from itertools import permutations

t = int(input('Test Cases : '))

while t>0:
    s = input('String : ')
    p = permutations(s) # ('A','B','C') tuple form
    l = []
    for i in p:
        l.append(''.join(i))
        
    l.sort()
    for i in l:
        print(i)
    t -= 1

'''
I/P : ABC
O/P : ABC ACB BCA BAC CAB CBA
'''