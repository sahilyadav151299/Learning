string = list(input().split(','))
vowels = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']

if string[0] in vowels:
    print(string+'-'+'yay')
else:
    final = ''
    for i in range(len(string)):
        if string[i] in vowels:
            break
        else:
            final += string[i]
            string[i] = ''

    final += 'ay'
    new = ''.join(string) + '-' + final
    print(new)


