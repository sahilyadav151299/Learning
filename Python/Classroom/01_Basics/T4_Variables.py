# 1) Variable in Python

# Python has no command to declare a variable.
# A variable is creates the moment we first assign a value.
# Python is a infer language and smart enough to get variable type.

numberVariable = 1000            # int type var
firstName = 'Sahil'              # string type var
lastName = "Yadav"               # string type var
numberVariable = 1515.1515       # int changed to float type
fullName = firstName + lastName  # string concatenation

# 2) Rules for variable names

# Must start with a letter or _ (underscore).
# Can't start with numbers or any special character.
# Only contain alphanumeric character A-Z,a-z,0-9,_.
# Case sensitive names

NUM = 12
num = 12

# 3) Different ways of assigne value

x, y, z = 'This', 'is', 'Sahil'
a = b = c = 'Python'

# 4) Object references

# Python interpreter works when we declare a variable.
# Python is highly object-oriented programming language,
# that's why every data item belongs to a specific type of class.
# In Python, variables are reference or pointer to an object.

language = 'Python'
print(type(language))       # <class 'str'>

A = 50                     # A refers to an integer object
B = A                      # B refers to the same object that a points
C = 50                     # C refers to the same object that a points

print(id(A), id(B), id(C))

# 5) Local variable, that declared inside the function or block.

def addition():
    a = 10
    b = 20
    c = a + b
    print('Sum :', c)

addition()      # function calling

# 6) Global variable

# We can use global variables inside or outside the function.
# A variable declared outside the function is the global variable by default.
# Python provides the global keyword to use global variable inside the function.

def mainFunction():
    global x            # treat x as global var
    print(x)            # 101
    x = 'Hey'
    print(x)            # Hey

x = 101                 # global var
print(x)                # 101
mainFunction()
print(x)                # Hey

# 6) Delete a variable

day = 'Monday'
print(day)          # Monday
del day             # day deleted
#print(day)          # NameError: name 'day' is not defined


# 7) Mutable Variables

a = 256
print(id(a))
b = 256
print(id(b))
b += 1
print(id(b))


