# 1) Ordered
# 2) Unchangeable or Immutable
# 3) Allow duplicate values
# 4) Denoted by ()

fruits = ('Apple', 'Banana', 'Cherry', 'Orange', 'Kiwi', 'Mango')

# 1) How to change values

temp = list(fruits)
temp.append('Lemon')
fruits = tuple(temp)
print(fruits)

# 2) Iteration over tuple

for item in fruits:
    print(item, end='=')

print()

# 3) Tuple with one item

oneItem = ('Hello')             # <class 'str'>
print(type(oneItem))
oneItem = ('Hello', )           # <class 'tuple'>
print(type(oneItem))

# 4) Accessing index only

print(fruits[2:6])
print(fruits[:])
print(fruits[5:])
print(fruits[:5])
print(fruits[::2])
print(fruits[-1])
print(fruits[-4:-1])

# 5) Other operations

t1 = ('A', 'B')
t2 = ('A', 'B')
t3 = t1 + t2

print(t3)
print(t3.count('A'))
print(t3.index('A'))
del t3
# print(t3)             # NameError: name 't3' is not defined

# 6) () are optional in tuple

t1 = 123, 'ABC', 2.14
print(t1)
print(type(t1))

t2 = (None, )           # empty tuple
print(t2)
print(type(t2))