bracket = input('Brackets () : ')
left = 0
right = 0

for b in bracket:
    if b == '(':
        left += 1
    else:
        right += 1

print(abs(left-right))