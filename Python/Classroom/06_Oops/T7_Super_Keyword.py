# 1) The super() is used to call parent-class functions if we override in sub-class
# 2) We can call functions without using parent-class name
# 3) This call must be at very first line in function body
# 4) MRO is always Left-to-Right like in multiple inheritance

class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def getInfo(self):
        print("Name : " + self.name)
        print("Age :", self.age)


class Student():
    def __init__(self, enroll):
        self.enroll = enroll

    def getInfo(self):
        print("Enroll :", self.enroll)

# multiple inheritance
class CollegeStudent(Person, Student):
    def __init__(self, name, age, enroll):
        super().__init__(name, age)
        self.enroll = enroll

    def getInfo(self):
        # calls person class getInfo(), MRO left-to-right
        super().getInfo()
        Student.getInfo(self)

clgStd = CollegeStudent('Sahil', 21, 101)
clgStd.getInfo()