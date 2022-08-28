import re

t = int(input())

while t!=0:
    words = input()
    ones = re.findall('[abcdegopq49ADRPQ6]',words)
    twos = re.findall('[B8]',words)

    print(ones,twos)
    print(len(ones) + len(twos)*2)

    t-=1

'''
1
Hello World 8
['e', 'o', 'o', 'd'] ['8']
6
'''