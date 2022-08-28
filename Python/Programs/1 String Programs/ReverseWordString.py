i = int(input('Enter Test Cases : '))

while i!=0:
    string = input('Enter String : ')
    lst = string.split()
    lst.reverse()
    print(' '.join(lst))
    i -= 1
