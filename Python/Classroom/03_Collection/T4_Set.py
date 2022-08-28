# 1) Unordered
# 2) No index
# 3) No duplicate values
# 4) Denoted by {}
# 5) Mutable

coutry = set(('India', 'England'))
print(coutry)
print(type(coutry))

coutry = {'India', 'England'}
print(coutry)
print(type(coutry))

# 1) Access items of set

for obj in coutry:
    print(obj)

# 2) Can add items one or more unique items only

coutry.add('Japan')
coutry.update(['Europe', 'Brazil'])
print(coutry)

# 3) Remove operation

coutry.remove('England')
print('Poped : ' + coutry.pop())    # Don't know which item gets removed as sets are unordered
coutry.clear()
print(coutry)
del coutry

# 4) Set operations

s1 = {10, 20, 30}
s2 = {30, 40, 50}

s3 = s1 | s2            # union
s4 = s1 & s2            # intersection

print(s3)
print(s4)

s5 = s1.union(s2)       # returns a new set, excludes any duplicate item
print(s5)

s1.update(s2)           # updates the existing set, excludes any duplicate item
print(s1)

