t = int(input('Enter Test Cases : '))

while t > 0:
    s = input('Enter Num : ')
    l = list(s)
    n = l.count('1')
    r = n * (n-1)
    print('O/P : ',int(r/2))
    t -= 1

'''
Count the no. of substrings that starts & ends with 1
I/P = '00100101'
O/P = '1001' , '100101' , '101'

I/P = '1111'                                  =  4
O/P = '11', '11', '11', '111', '111', '1111'  =  6

if count of 1 = 4,   [ nCr = !n / !(n-r) * !r ]
combination formula,   4C2 = !4 / !(4-2) * !2
                           = 4 * 3 * !2 / !2 * !2
                           = 6 
                           
simplified formula ,   [n * (n-1)] / 2                           
'''