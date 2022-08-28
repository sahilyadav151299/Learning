# 1) Use when you don't know exact no of args.
# 2) Pass comma separated value which treated as tuple in function call.
# 3) Denoted by *args
# 4) Special tuple variable *args
# 5) Special dictionary variable **args

# Tuple variable
def info(*details):
    print(details)
    print(type(details))

info('Sahil', 21, '15/12/1999')


# Dictionary variable
def food(category, **data):
    print(category)
    print(type(data))
    print(data)

food('Fruits' ,val1='Apple', val2='Banana')

# Function overloading, one function with multiple arguments
def addNum(n1, n2, *values):
    res = n1 + n2

    if len(values) > 0:
        for val in values:
            res += val

    return res

print(addNum(1, 2))
print(addNum(1, 2, 3))
print(addNum(1, 2, 3, 4))
print(addNum(1, 2, 3, 4, 5))