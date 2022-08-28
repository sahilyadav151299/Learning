class A:
    def show(self):
        print("Inside A")

class B(A):
    def show(self):
        print("Inside B")

class C(A):
    def show(self):
        super().show()
        print("Inside C")


a = A()
b = B()
c = C()

a.show()
b.show()
c.show()