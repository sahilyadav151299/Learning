n = int(input('No. of values : '))
count = [0]*10
num = list(map(int,input()))

for i in num:
    count[i] += 1

max_value = max(count)

if max_value > n/2:
    idx = count.index(max_value)
    print(idx)
else:
    print('-1')

'''
I/P : 5                         
      3 1 3 3 2     n = 5,  max element = 3, n/2 i.e 5/2 < 3 times     O/P : 3 
      3
      1 2 3         n = 3,  max element = 3, n/2 i.e 3/2 < 1 times     O/P : -1
      
Constarint : 0-10^6 == 10^6 + 1      
      
'''