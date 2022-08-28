string = input('PostFix Expression : ')
stack = []

for digit in string:
    if digit.isnumeric():
        stack.append(digit)
    else:
        num1 = int(stack.pop())
        num2 = int(stack.pop())
        ans = 0
        if digit == '+':
            ans = num1 + num2
        elif digit == '-':
            ans = num2 - num1
        elif digit == '*':
            ans = num1 * num2
        else:
            ans = num2 / num1

        stack.append(ans)

print(stack[0])


'''
I/P : 231*+9-
     
     = 2 3 1 * 
     = 2 3 +
     = 5 9 -
     = -4
    
O/P : -4
'''