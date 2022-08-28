# Python is an Object Oriented PL
# Almost everything in python is an object
# Create a class using keyword 'class'
# Every time we dynamically create an object its allocated a new space

class Computer:
    def config(self):
        print("i7, 16GB, 1TB")

Com1 = Computer()           # create Com1 object
Computer.config(Com1)       # use config() for Com1
print(type(Com1))

Com2 = Computer()           # create Com2 object
Com2.config()               # take Com2 as arg to pass in config()
print(type(Com2))

