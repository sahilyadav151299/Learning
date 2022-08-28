from itertools import permutations

num = input().split()

permutation = permutations(num)
n = []

for tpl in permutation:
    print(tpl)
    val = int(''.join(tpl))
    n.append(val)

print(max(n))

'''
Given a list of integer numbers, you have to print max possible
number formed by the given list number.
'''
