# 1) Shallow copy, same data with multiple references

l1 = [10, 20, 30]
print(id(l1))

l2 = l1         # shallow copy
print(id(l1))
print(l2)

l2.append(40)   # both l1 and l2 changed
print(l2)
print(l1)

# 2) Deep copy, different data with different references

import copy

l5 = [10, 20, 30]
print(id(l5))

l6 = copy.deepcopy(l5)      # way-1 deepcopy
print(id(l6))

l7 = l5.copy()              # way-2 deepcopy
print(id(l7))

l8 = l5[:]                  # way-3 deepcopy
print(id(l8))