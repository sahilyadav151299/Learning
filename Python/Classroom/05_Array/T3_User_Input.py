from array import *

intArray = array('i', [])

length = int(input('Enter length : '))

for index in range(length):
    val = int(input('Enter Value : '))
    intArray.append(val)

print(intArray)

value = int(input('Enter value to find the index : '))
print(intArray.index(value))

idx = 0
for val in intArray:
    if val == value:
        print(idx)
        break
    idx += 1
else:
    print('Not Found')


