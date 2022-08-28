from array import *

values = array('i', [10, 20, 30, 40])

print(values)
print(id(values))

newArray = array(values.typecode, (a * a for a in values))

print(newArray)
print(id(newArray))
