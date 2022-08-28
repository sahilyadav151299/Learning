# 1) Ordered
# 2) Changeable or Mutable
# 3) Allow duplicate values
# 4) Denoted by []

myList = ['B', 'C', 'D', 'E', 'F', 'G']

# 1) Operations on list

print(myList[0])                # access item via index
print(myList[-1])               # access last item
print(len(myList))              # length of the list
myList.insert(1, 'A')           # inserts 'A' at index '1'
myList.append('H')              # add 'H' from last
print(myList.count('A'))        # returns frequency of 'A'
print(myList.index('A'))        # returns index of 'A'
myList.remove('A')              # removes the specified value
print(myList.pop())             # removes the last value (if index not specified) & returns
myList.reverse()                # reverse within the list
myList.sort()                   # sort within the list
new = myList.copy()             # make a copy of list
print('New List : ', new)
new.clear()                     # clears the list item
print(new)
del new                         # delete the list completely

# 2) Indexing

print(myList[2:6])
print(myList[:])
print(myList[5:])
print(myList[:5])
print(myList[::2])
print(myList[-1])
print(myList[-4:-1])

# 3) Iteration of the list

print('Print Names : ')

for name in myList:
    print(name)


print('Display Names :')

for idx in range(0,len(myList)):
    print(myList[idx])

# 4) Join two list

l1 = [10, 20, 30]
l2 = [40, 50, 60]
l3 = []

l4 = l1 + l2
print(l4)

l1.extend(l2)
print(l1)

for val in l1:
    l3.append(val)
print(l3)

# 5) Mutable List, Same id after modification

varList = [123, "ABC", 1.458]

print(id(varList))         # location before modification
varList.append('A')
print(id(varList))         # location after modification

# 6) List using range()

numList = list(range(10))
print(numList)             # 0-9 numbers

# 7) List inside tuple

varTuple = (123, 'ABC', ['inner', 'list'])

print(id(varTuple))
varTuple[2].append('inner list is mutable not the outer tuple')
print(id(varTuple))

print(varTuple)

# 8) Tuple inside list

varList = [123, 'ABC', ('inner', 'list')]

print(id(varList))
varList.append('outer list is mutable not the inner tuple')
print(id(varList))

print(varList)

# 9) Extend vs Append

l1 = [1, 2]
l2 = [3, 4]
l3 = [5, 6]

l1.append(l2)       # appends whole list as value
print(l1)
l2.extend(l3)       # extends the list with values
print(l2)

# 10) Sort (within the list) vs Sorted (returns a sorted list)

numList = [-1, 2, 10, 6, -8]

numList.sort()
print(numList)
numList.sort(reverse=True)
print(numList)

sortedList = sorted(numList)
print("Actual List : ", numList)
print("Sorted List : ", sortedList)

# sort using lambda functions
strList = ['welcome', 'they', 'to', 'go']
newList = sorted(strList, key=lambda ch : len(ch))
print(newList)

# 11) List Comprehension

l1 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

l2 = [ n for n in l1 ]
print(l2)
l3 = [ n**2 for n in l2 ]
print(l3)
l4 = [ n for n in l3 if n%2 == 0 ]
print(l4)

l5 = [(1,1,'A',1), (2,2,'B',2), (3,3,'C',3)]
l6 = [ n1+n2+n3 for (n1,n2,ch,n3) in l5 ]
print(l6)

# 12) Nested List Comprehension

l1 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
l2 = [ -x for x in [ x**2 for x in l1]]
print(l2)

l3 = ['a', 'ab', 'abc', 'abcd']
l4 = [ ch for ch in [ ch.upper() for ch in l3] if len(ch) > 2 ]
print(l4)

# map-map equivalent for l2
l5 = list(map(lambda x : -x, map(lambda x : x**2, l1)))
print(l5)

# map-filter equivalent for l4
l6 = list(map(lambda ch : ch.upper(), filter(lambda ch : len(ch)>2, l3)))
print(l6)


