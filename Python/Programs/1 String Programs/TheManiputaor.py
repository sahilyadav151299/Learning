def cal(string):
    length = len(string)
    str1 = list(string)

    for i in range(length):
        if str1[i] == '#':
            for j in range(i-1,-1,-1):
                if str1[j].isalpha():
                    if str1[j] == 'Z':
                        str1[j] == 'A'
                        break
                    else:
                        str1[j] = chr(ord(str1[j])+1)
                        break

    return ''.join(str1)

t = int(input())
while t!=0:
    s1 = input()
    s2 = input()
    ss1 = cal(s1)
    ss2 = cal(s2)

    string1 = ''.join(ss1.split('#'))
    string2 = ''.join(ss2.split('#'))

    if string1 == string2:
        print('Yes')
    else:
        print('No')

    t -= 1






'''
I/P : E # R # # C              F T A # #
      
      F R # # C                F T B #
      F S # C                  F T C
      F T C
                 
O/P : IF FTC == FTC  'YES'  ELSE  'NO'            
'''