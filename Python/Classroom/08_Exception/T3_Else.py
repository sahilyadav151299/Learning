# 1) Else with try-except
# 2) Using base class Exception as object
# 3) Else executes if no error occurred

try:
    a = int(input("Enter a : "))
    b = int(input("Enter b : "))

    c = a/b

    print("a/b = %d" %c)

# Using exception object with the except statement
except Exception as e:
    # this code executes if error occurred
    print("can't divide by zero")
    # returns exception class
    print(Exception)
    # returns actual error(e) message
    print(Exception.__str__(e))
    print(e)

else:
    # executes if no except block is executed
    print("Hi I am else block")

