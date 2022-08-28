# Decorators can add extra functionality to an existing function

# 1) Functions that take other functions as arguments are called as higher order functions

def inc(x):
    return x + 1

def dec(x):
    return x - 1

def operate(func, x):
    result = func(x)
    return result

print(operate(inc, 3))
print(operate(dec, 3))

# 2) Furthermore, a function can return another function

def is_called():
    def is_returned():
        print("Hello")
    return is_returned

new = is_called()
new()
