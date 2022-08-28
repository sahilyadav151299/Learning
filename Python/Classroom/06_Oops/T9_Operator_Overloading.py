# Magic methods have __doubleUnderscores__ in it
# Default overloaded operators calls these methods

num1 = 10
num2 = 20

print(num1 + num2)
print(int.__add__(num1, num2))
print(int.__mul__(num1, num2))
print(int.__gt__(num1, num2))
print(int.__lt__(num1, num2))

str1 = "Sahil"
str2 = "Yadav"

print(str1 + str2)
print(str.__add__(str1, str2))
print(str.__lt__(str1, str2))
print(str.__gt__(str1, str2))
print(str.__le__(str1, str2))

# Custom operator overloading

class Student:
    def __init__(self, marks1, marks2):
        # instance variable
        self.hindi = marks1
        self.english = marks2

    def __add__(self, other):
        s1 = self.hindi + self.english
        s2 = other.hindi + other.english
        new = Student(s1, s2)
        return new

    def __gt__(self, other):
        s1 = self.hindi + self.english
        s2 = other.hindi + other.english

        if s1 > s2:
            return True
        else:
            return False

    def __str__(self):
        return "{} {}".format(self.hindi, self.english)

s1 = Student(50, 100)
s2 = Student(70, 60)

res = bool(s1 > s2)
print("Result :", res)

s3 = s1 + s2
print(s3.hindi, s3.english)

print(s2)               # default behaviour
print(s2.__str__())     # <__main__.Student object at 0x0000028CE45F8470>






