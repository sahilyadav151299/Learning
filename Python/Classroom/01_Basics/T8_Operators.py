# Operators are use to perform predefined operations

# 1) Arithmetic operators

print('Arithmetic operators')
n1, n2 = 12, 2

print(n1 + n2)          # Addition
print(n1 - n2)          # Subtraction
print(n1 * n2)          # Multiplication
print(n1 / n2)          # Division
print(n1 % n2)          # Modulus
print(n1 ** n2)         # Exponential
print(n1 // n2)         # Floor division

# 2) Assignment Operators & Shorthand Operators

print('Assignment Operators')

num = 0
print(num)
num += 10
print(num)
num -= 5
print(num)
num *= 5
print(num)
num /= 5
print(num)
num **= 2
print(num)
num //=5
print(num)

# 3) Comparison operators

print('Comparison operators')

n1, n2 = 14, 26

print(n1 == n2)
print(n1 != n2)
print(n1 <= n2)
print(n1 >= n2)
print(n1 > n2)
print(n1 < n2)

# 4) Logical Operators

print('Logical Operators')
n1, n2, n3 = 12, 14, 16

print(n1 and n2)
print(n1 or n2)
print(not(n1 > n2 or n3 > n2))
print(n1 < n2 and n2 < n3)
print(n1 > n2 or n3 > n2)

# 5) Identity Operators

print('Identity Operators')
n1 , n2, n3 = 12, 12, 14

print(n1 is n2)             # Returns true if both variables are same
print(n1 is n3)
print(n1 is not n3)         # Return true if both variables are not same

# 6) Membership Operators

print('Membership Operators')
myList = [12, 14, 16]
name = 'Hello'

print(12 in myList)
print(10 not in myList)
print('S' in name)
print('H' in name)

# 7) Bitwise Operators

print('Bitwise Operators')
n1, n2 = 4, 2

print(n1 & n2)         # Sets each bit 1 if both bits are 1
print(n1 | n2)         # Sets each bit 1 if one of two bit is 1
print(n1 ^ n2)         # Sets each bit 1 if only one bit is 1
print(n1 >> n2)        # Zero fill left shift
print(n1 << n2)        # Signed right shift
print(~ n1)            # Inverse all the bits

# 8) Number System Conversion

print(bin(10))          # 0b1010  - decimal to binary
print(bin(0o12))        # 0b1010  - octal to binary
print(bin(0xa))         # 0b1010  - hexa to binary

print(oct(10))          # 0o12    - decimal to binary to octal pair(3)
print(oct(0b1010))      # 0o12    - bianry to octal pair(3)
print(oct(0xa))         # 0o12    - hexa to binary to octal pair(3)

print(hex(10))          # 0xa     - decimal to bianry to hexa pair(4)
print(hex(0b1010))      # 0xa     - bianry to hexa pair(4)
print(hex(0o12))        # 0xa     - octal to binary to hexa pair(4)

