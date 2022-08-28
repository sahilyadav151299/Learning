raw = input()

alphabets = []
numbers = []
specail = []

for ch in raw:
    if ch.isdigit():
        numbers.append(ch)
    elif ch.isalpha():
        alphabets.append(ch)
    else:
        specail.append(ch)


if len(specail)==0:
    print('-1')
elif len(specail)%2==1:
    print(numbers)
else:
    print(alphabets)

'''
In raw data if no of special chars are

Even --- Alphabets
Odd  --- Numbers
None --- -1
'''