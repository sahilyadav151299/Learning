# 1) Call by reference means passing the actual value as an argument.

def changeValue(myList):
    myList.append(40)
    myList.append(50)

myList = [10, 20, 30]
print(myList)

changeValue(myList)
print(myList)

# 2) Example of shallow copy using call be reference

def display(l4):
    l4.append(40)
    print("Inside display() :", l4)

l3 = [10, 20, 30]
print("Before display() call :", l3)

display(l3)      # shallow copy
print("After display() call :", l3)