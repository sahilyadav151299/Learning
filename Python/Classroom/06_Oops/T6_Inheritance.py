# A Parent-Child concept
# Parent/Super/Base class
# Child/Sub/Derived class
# When we create a sub-class obj, it looks for sub-class __init__()
# If it doesn't find __init__() in sub-class then looks in base class

# parent class
class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age
        self.gender = 'T'

    def getInfo(self):
        print("Name : " + self.name + " Age :", self.age, "Gender : " + self.gender)

# child class (single inheritance)
class Male(Person):
    # data member, __init__() and getInfo() inherited here
    def setGender(self, gender):
        self.gender = gender

male1 = Male('Sahil', 21)
male1.getInfo()
male1.setGender('M')
male1.getInfo()

# child class (multi-level inheritance)
class Female(Male):
    # if you don't want to add any properties
    pass

female1 = Female('Anjali', 19)
female1.getInfo()
female1.setGender('F')
female1.getInfo()

# child class (single-inheritance)
class Transgender(Person):
    # when we add own __init__(), we override it
    # to access parents __init(), use this syntax
    # this call must be at very first line in function body
    def __init__(self, name, age):
        Person.__init__(self, name, age)

transgender1 = Transgender('Somebody', 45)
transgender1.getInfo()
