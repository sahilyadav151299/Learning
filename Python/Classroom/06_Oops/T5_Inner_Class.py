# outer class
class Student:
    def __init__(self, name, enroll):
        self.name = name
        self.enroll = enroll
        self.laptop = self.Laptop()         # student obj.laptop obj

    def getStudentDetails(self):
        print("Name {} Enrollment {}".format(self.name, self.enroll))
        self.laptop.getLaptopDetails()

    # inner class
    class Laptop:
        def __init__(self):
            self.brand = 'DeLL'
            self.ram = '8GB'
            self.cpu = 'i7'

        def getLaptopDetails(self):
            print("Brand {}, RAM {}, CPU {}".format(self.brand, self.ram, self.cpu))

s1 = Student('Sahil', 101)
s2 = Student('Vishal', 102)

s1.getStudentDetails()
s2.getStudentDetails()

# inner class object
l1 = Student.Laptop()
print(l1.brand, l1.ram, l1.cpu)