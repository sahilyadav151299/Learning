data = input().split(',')

for obj in data:
    string = obj.split(':')
    st = string[0]
    l = len(st)
    num = string[1]
    sum = 0
    for digit in num:
        sum += int(digit)
    if sum % 2 == 0:

        print(st[-1]+st[0:l-1])
    else:
        print(st[2:l]+st[0:2])




'''
I/P : abcd : 1234                                  I/P : bcdgfhf : 1127839

      1 + 4 + 9 + 16 = 30  i.e. even               sum of square is odd
      rotate right by 1 pos                        rotate left by 2 pos
      O/P : dabc                                   O/P : dgfhfbc
      
'''