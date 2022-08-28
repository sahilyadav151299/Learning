# There are 2 types of variables in a class
# Instance Variable      -  Different for each object/created inside __init__()
# Class/Static Variable  -  Shared among all objects/created outside __init__()

class Car:
    # class variable
    wheels = 4

    def __init__(self, name, oil):
        # instance variable
        self.name = name
        self.oil = oil


C1 = Car("Nano", "Petrol")
C2 = Car("Maruti", "Diesel")

print(C1.name, C1.oil, Car.wheels)
print(C2.name, C2.oil, Car.wheels)

Car.wheels = 5          # changes value for all objects
C1.oil = 'Diesel'       # changes value for only C1

print(C1.name, C1.oil, Car.wheels)
print(C2.name, C2.oil, Car.wheels)