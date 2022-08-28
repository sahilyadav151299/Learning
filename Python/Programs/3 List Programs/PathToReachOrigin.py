from  math import factorial

val = input('Enter M, N : ')
l = list(map(int,val.split(' ')))
m = l[0]
n = l[1]
numerator = factorial(m+n)
denominator = factorial(m) * factorial(n)
print('Ways : ',numerator//denominator)


'''
formula = (M + N)! / (M! * N!) == no. of distinct way to reach origin

              M
   -------------  N      move ony Left <-- or Down |
   |  |  |  |  |
   -------------
   |  |  |  |  |
 0 -------------
   0
'''