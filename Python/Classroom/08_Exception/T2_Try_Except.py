# 1) try block must be followed with the except

try:
    a = int(input("Enter a : "))
    b = int(input("Enter b : "))
    c = a/b
except ZeroDivisionError:
    print("Can't divide with zero")
except Exception:
    print("Something went wrong")


# 2) Except without Exception

try:
    a = int(input("Enter a : "))
    b = int(input("Enter b : "))
    c = a/b
except:
    print("Can't divide with zero")