# 1) General if else if

num1 = int(input('Enter number 1 : '))
num2 = int(input('Enter number 2 : '))

if num1 > num2:
    print(num1, 'is greater than', num2)
elif num1 < num2:
    print(num1, 'is less than', num2)
else:
    print(num1, 'and', num2, 'are equals')

# 2) short hand if for one line of code

age = int(input('Enter Your Age : '))

if age >= 18: print('Eligible to vote')

print('Eligible to vote') if age > 18 else print('Not Eligible')

# 3) short hand if else if ladder

print(num1) if num1 > num2 else print(num2) if num2 > num1 else print('Equals')

# 4) nested if
n1 = int(input('Enter n1 : '))
n2 = int(input('Enter n1 : '))
n3 = int(input('Enter n1 : '))

if n1 > n2:
    if n1 > n3:
        print(n1, 'is greatest')
    else:
        print(n3, 'is greatest')
else:
    print('Not evaluated')