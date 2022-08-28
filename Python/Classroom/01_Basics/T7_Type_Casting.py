# We use constructor functions for type casting and type conversion

x = int(12)
y = int(12.12)
z = int('1212')
print(type(x), type(y), type(z))
# <class 'int'> <class 'int'> <class 'int'>

a = float(12)
b = float(12.12)
c = float('12.12')
print(type(a), type(b), type(c))
# <class 'float'> <class 'float'> <class 'float'>

l = str('Sahil')
m = str(12)
n = str(12.12)
print(type(l), type(m), type(n))
# <class 'str'> <class 'str'> <class 'str'>

myList = [12, 13, 14, 15]
print(type(myList))
# <class 'list'>
myList = tuple(myList)
print(type(myList))
# <class 'tuple'>