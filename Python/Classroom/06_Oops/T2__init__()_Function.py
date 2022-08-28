# 1) All classes have a function called __init__()
# 2) Called every time automatically for every object creation
# 3) A'self' parameter references to the current instance/calling obj
# 4) The 'self' must be the first parameter of any function
# 5) The 'self' is used to access variables that belongs to the calling obj
# 6) The 'self' can be renamed to any name but must be first in signature

class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def compareAgeWith(self, person):
        if self.age == person.age:
            return True
        else:
            return False

Person1 = Person("Sahil", 21)
print("Name : {}, Age : {}".format(Person1.name, Person1.age))

Person2 = Person("Vishal", 23)
print("Name : {}, Age : {}".format(Person2.name, Person2.age))

Person3 = Person("Sonu", 21)
print("Name : {}, Age : {}".format(Person3.name, Person3.age))

print(Person1.compareAgeWith(Person2))
print(Person1.compareAgeWith(Person3))

Person4 = Person("Sahil", 21)
print("Name : {}, Age : {}".format(Person4.name, Person4.age))

# same data but different locations
print(id(Person1))
print(id(Person4))

# del specific objects and properties
del Person4.age
# print(Person4.age)   # AttributeError: 'Person' object has no attribute 'age'

del Person4
# print(Person4)       # NameError: name 'Person4' is not defined