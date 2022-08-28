# Generator gives us iterator object
# yield() makes a function as a generator

def topTen():
    n = 1
    while n <= 10:
        square = n * n
        # holds every value of square
        yield square
        n += 1

# returns an iterator object
values = topTen()

for val in values:
    print(val)