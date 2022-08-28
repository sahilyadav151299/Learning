import sys

def printNumber(n):
    print("Inside printNumber() :", n)

print(__name__)             # current file name, in this case __main__
print(sys.argv)
printNumber(sys.argv[1])

# Execute this file using below command
# F:\Python\Python Class\10 Custom Module>python T4_SpecialVar.py 100





