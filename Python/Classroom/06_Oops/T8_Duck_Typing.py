# There are 4 ways of implementing polymorphism in python
# 1) Duck Typing
# 2) Operator Overloading
# 3) Method Overloading
# 4) Method Overriding

class PyCharm:
    def execute(self):
        print("Running")

class MyEditor:
    def execute(self):
        print("Compiling")
        print("Running")

class Laptop:
    def code(self, ide):
        ide.execute()

#ide = PyCharm()
ide = MyEditor()

laptop1 = Laptop()
# not concern about which class it is, code will surely excutes
laptop1.code(ide)