# 1) String literals

single_Line_String = 'This is string literal'
print(single_Line_String)

multi_line_String1 = '''
This is multi-line 
string
'''
print(multi_line_String1)

multi_line_String2 = 'this is \
multi-line string'
print(multi_line_String2)

# 2) Numeric literals

binary = 0b10100          # Binary Literals
decimal = 100             # Decimal Literal
octal = 0o215             # Octal Literal
hexadecimal = 0x12d       # Hexadecimal Literal

# Float literal
float_1 = 100.5
float_2 = 1.5e2
float_3 = -87.7E4

# Complex literal
a = 5 + 3.14j
b = -5J
print(a, a.imag, a.real)

# 3) Boolean literals

comp_1 = (1 == True)
comp_2 = (0 == False)
comp_3 = 10 + True
comp_4 = 10 + False
comp_5 = True + False

print(comp_1, comp_2, comp_3, comp_4, comp_5)

# 4) Special literals

null = None
print(null)

# 5) Collection literals

myList = ['Sahil', 21, 'CSE', 2021]
myTuple = ('data1', 'data2')
mySet = {'A', 'B', 'C'}
myDict = {'name': 'Sahil', 'age': 21}

print(myList)
print(myTuple)
print(mySet)
print(myDict)