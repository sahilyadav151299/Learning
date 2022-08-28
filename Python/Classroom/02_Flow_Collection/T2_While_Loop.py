# 1) General while loop

num = int(input('Enter number to print table : '))
i = j = 1

while i <= 10:
    print(num, 'X', i, '=', num * i)
    i += 1

# 2) while with else runs when while successfully executed

while j <= 10:
    print(num, 'X', j, '=', num * j)
    j += 1
else:
    print('value of j becomes', j)