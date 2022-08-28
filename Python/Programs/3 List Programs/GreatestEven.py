import itertools

raw = input()
digits = set()

for i in raw:
    if i.isdigit():
        digits.add(i)

p = list(itertools.permutations(digits,len(digits)))
t = -1
for n in p:
    n = int(''.join(n))
    if n%2==0 and n>t:
        t=n

print(t)

'''
A string which is a mixture of letter and integer and special char
from which find the largest even number from the available digit
after removing the duplicates.
If an even number is not formed then return -1.
Ex : infosys@337
O/p : -1
Hello#81@21349
O/p :984312
'''