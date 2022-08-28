def validator(string):
    stack = []
    count = 0
    for b in string:
        if b == '(' or b == '{' or b == '[':
            stack.append(b)
            count += 1
            continue
        if len(stack) == 0:
            return 0
        x = stack.pop()
        if x == '[' and b == ']':
            count += 1
        elif x == '{' and b == '}':
            count += 1
        elif x == '(' and b == ')':
            count += 1
    if len(stack) == 0:
        return 0
    else:
        return count+1

string = input('Enter : ')
print(string)
print(validator(string))

'''
Find the position from where the parenthesis is not balanced. Ex. {,},[,],(,)
If the string is balanced return 0 else return position of the unbalanced one.
'''
