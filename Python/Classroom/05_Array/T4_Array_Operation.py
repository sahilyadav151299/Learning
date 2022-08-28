import array as arr

# 1) Accessing array elements

values = arr.array('i', [1, 2, 3, 4, 5])
print(values[0])    # using index

for val in values:  # using for loop
    print(val)

# 2) Add or Update array elements

values[0] = 10      # change first value
values[2:] = arr.array('i', [30, 40, 50, 60])       # insert from 2nd index
values.append(100)  # add at last index

print(values)

# 3) Delete element from an array

del values[1]   # del at 1st index
print(values)

print(values.pop(0))    # pop from 0th index