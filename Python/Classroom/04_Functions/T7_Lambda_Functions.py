# 1) Lambda function is known as the anonymous function that is defined without a name.
# 2) Lambda functions can accept any number of arguments,
# 3) But they can return only one value in the form of expression.
# 4) Syntax,   lambda arguments : expression

from functools import reduce

# 1) With arguments

square = lambda x : x * x
power = lambda x, y : x ** y
product = lambda x, y, z : x * y * z

print(square(4))
print(power(5, 4))
print(product(4, 2, 8))

# 2) With function

def table(n):
    return lambda x : x * n

n = 5
myTable = table(5)

print('Print Table of', n)
for i in range(1, 11):
    print(myTable(i))

# 3) Built-in filter() function accepts a function and a list as an argument.

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

even = list(filter(lambda x : x % 2 == 0, numbers))

print(even)

# 4) Here map() function accepts a function and a list

double = list(map(lambda x : x * x, even))

print(double)

# 5) From functools import reduce, accepts a function and a list

sum = reduce(lambda x, y : x + y, double)

print(sum)

# 6) We also can use function here

l1 = ['a', 'ab', 'abc', 'abcd']

l2 = list(map(str.upper, l1))
print(l2)
