t = int(input('Test Cases : '))

while t>0:
    arr = []
    n = int(input('Range : '))
    for i in range(n):
        arr.append(int(input('Num {} : '.format(i+1))))

    s = sum(arr)
    a = n*(n+1)//2
    print('Missing Num Is :',(a-s))

    t -= 1

'''
I/P : Test Cases : 1
      Range : 5
      1 2 3 missing 5
      
O/P : 4      
      
Logic : (1+2+3+4+5) = 15
        (1+2+3+5) = 11
        15 - 11 = 4
        
        n(n+1)/2 = 15
        n = Range
        
        sum = sum + num           
'''