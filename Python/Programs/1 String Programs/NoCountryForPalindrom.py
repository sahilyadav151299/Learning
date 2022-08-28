t = int(input('Test Cases : '))

while t != 0:
    Str = input().split()
    for d in Str:
        if d.lower() != d.lower()[::-1]:
            print(d,end=' ')
    print()
    t -= 1


'''
I/P : 3  (test cases)
      The quick BrOwn
      Malayalam LeVEL ll p
      Devil
      
O/P : The quick Brown
    
      Devil
'''