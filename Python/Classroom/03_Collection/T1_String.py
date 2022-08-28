# 1) String literal are surrounded by '' or "".

world = " World"
print('Hello', end='')
print(world)

# 2) Strings in python are arrays of bytes representing unicode characters.
# python has no data types for characters.
# a string of length 1 is a character i.e. str[0]

char = 'A'
print(char[0])
chars = 'ABC'
print(chars[0], chars[1], chars[2])

# 3) Slicing of string returns a range of characters

string = 'This is python course'

print('Positive Indexing :')
print(string[8])             # char at 8th index
print(string[8:])            # from 8th index to last
print(string[8:14])          # char at 14 excluded
print(string[8:14:2])        # char having gap of 2

print('Negative Indexing :')
print(string[-1])            # char at last index
print(string[8:-1])          # from 8 to -1 index
print(string[-13:-7])        # from last 7th to 12th
print(string[-13:-7:2])      # char having gap of 2

# 4) String methods

print('String Methods :')
sentence = ' Honesty is the best policy '

print(sentence)
print(len(sentence))
print(sentence.strip())
print(sentence.lower())
print(sentence.upper())
print(sentence.split(' '))
print(sentence.replace('H', 'h'))
print(sentence.strip().capitalize())
print(sentence.center(50))
print(sentence.casefold())
print(sentence.swapcase())
print(sentence.count('s'))
print('+'.join(sentence))

# 5) Check sting in a certain sentence

if 'best' in sentence:
    print(sentence.swapcase())

if 'best' not in sentence:
    print(sentence)
else:
    print('Sentence has best')

# 6) String concatenation & formatting

firstName = 'Sahil'
lastName = 'Yadav'
fullName = firstName + ' ' + lastName
print(fullName)

name = 'My name is {} {}'
print(name.format(firstName, lastName))
print('My name is {} {}'.format(firstName, lastName))

# 7) Escape characters, used to insert special characters

print('I\'m alrigth')
print('Hi\\Hello')
print('I\rI am')
print('You\nknow')
print('I \bam')

# 8) Raw string : used for directory paths, text pattern matching

print(r'C:\temp\new.txt')

# 9) String operations

print('Sahil' * 2)

if 'sahil' == 'Sahil':
    print('True')
else:
    print('False')

