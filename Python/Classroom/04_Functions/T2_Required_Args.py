# Arguments which are required to be passed at time of function call
# with the exact match of their positions in the function call
# Also called as positional argument

def add(n1, n2):
    sum = n1 + n2
    return  sum

n1 = int(input('Enter n1 : '))
n2 = int(input('Enter n2 : '))

res = add(n1, n2)
print('Sum :', res)