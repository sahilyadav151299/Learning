# 1) Input

name = input('Enter your name: ')
print("Hello", name)

age = int(input("Enter your age : "))
print("Your Age Is", age)

# 2) Output Output Formatting

print("One way of output")
print("Value of a is", 12)
print("My name is " + "khan")
print(1, 2, 3, 4)
print(1, 2, 3, 4, sep="0000")
print(1, 2, 3, 4, end="0000")

x, y = 5, 10
print('\nThe value of x is {} and y is {}'.format(x,y))

# using tuple index
print('I love {0} and {1}'.format('bread','butter'))
print('I love {1} and {0}'.format('bread','butter'))

# using keyword arguments
print('Hello {name}, {greet}'.format(greet = 'Goodmorning', name = 'John'))

# using format specifiers
x = 12.3456789

print('The value of x is %.2f' %x)

print('%d %s' %(1, 'Hey'))