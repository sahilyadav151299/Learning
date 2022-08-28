# 1) Instance Method (self)     -   Accessor method fetches data (getters)
#                               -   Mutator method modifies data (setters)

# 2) Class Method (cls)         -   Works with class variable
#                               -   Decorator @classmethod

# 3) Static Method ()           -   Use if nothing to do with any instance/class variable
#                               -   Decorator @staticmethod

class Student:
    # class variable
    university = 'PSL University'

    # can call it as constructor
    def __init__(self, marks1, marks2):
        # instance variable
        self.hindi = marks1
        self.english = marks2

    # instance method
    def totalMarks(self):
        return self.hindi + self.english

    # accessor method
    def getMarks(self):
        return 'Hindi {}, English {}'.format(self.hindi, self.english)

    # mutator method
    def setMarks(self, marks1, marks2):
        self.hindi = marks1
        self.english = marks2

    # class method
    @classmethod
    def getUniversityName(cls):
        return cls.university

    # static method
    @staticmethod
    def getStudentClassInfo():
        print("This class holds marks of students")


S1 = Student(80, 90)

# instance method
print(S1.getMarks())
print(S1.totalMarks())

S1.setMarks(85, 90)

print(S1.getMarks())
print(S1.totalMarks())
# class method
print(S1.getUniversityName())
print(Student.getUniversityName())
# static method
S1.getStudentClassInfo()
Student.getStudentClassInfo()