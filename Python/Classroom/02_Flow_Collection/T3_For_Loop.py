# 1) for loops iterates over a sequence of list | tuple | set | dictionary | string

users = ['Sahil', 'Aditya', 'Afreen', 'Shubham']

for user in users:
    print('Username : ' + user)

# 2) loop through a string

for char in 'String':
    print(char)

# 3) loop over a range()

print('0 to 3, 4 excluded')
for i in range(4):
    print(i)

print('5 to 7, 8 excluded')
for i in range(5,8):
    print(i)

print('1 3 5 having gap of 2')
for i in range(1, 6, 2):
    print(i)

# 4) else with for

for i in 'Hello':
    print(i, end='')
else:
    print('\nLoops works fine')

# 5) Nested loop

for i in range(1, 2):
    print('Table of', i)
    for j in range(1, 11):
        print(i*j)