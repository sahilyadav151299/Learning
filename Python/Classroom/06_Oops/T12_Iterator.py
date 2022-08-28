# 1) An iterator is an object which implements iterator protocol which consists of 2 methods
# 2) __itr__()  and  __next__()
# 3) Iterator can traverse through all of its values
# 4) All collections are iterable object
# 5) All of these have an iter() method which is used to get an iterator

myTuple = ("Apple", "Boxing", "Cafeteria")

myItr = iter(myTuple)       # returns an iterator object
# travers through values
print(next(myItr))
print(next(myItr))
print(next(myItr))

# 6) String can also be iterable object

myStr = "Won"
myItr = iter(myStr)
print(myItr.__next__())      # w
print(myItr.__next__())      # o
print(myItr.__next__())      # n

# 7) The for loop actually creates an iterator object & calls next() for each iteration

for ch in myStr:
    print(ch)

# 8) Custom Iterator Object

class TopTen:
    def __init__(self):
        self.num = 1

    def __iter__(self):
        # return value as iterator
        return (self)

    def __next__(self):
        if self.num <= 10:
            val = self.num
            self.num += 1
            return val
        else:
            raise StopIteration

values = TopTen()

valuesItr = iter(values)
print(next(values))         # 1
print(next(values))         # 2

# prints 3,4,5,6,7,8,9,10
for i in values:
    print(i)
