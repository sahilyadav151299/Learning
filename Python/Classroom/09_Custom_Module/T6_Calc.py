def add():
    print("Result of add()")
    print(__name__)

def sub():
    print("Result of sub()")
    print(__name__)

def main():
    print("Inside main of Calc")
    add()
    sub()

if __name__ == '__main__':
    main()

