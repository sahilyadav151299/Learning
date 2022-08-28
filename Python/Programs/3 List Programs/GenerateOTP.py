num = input('Enter number')
l = len(num)
otp = ''

for odd in range(1,l,2):
    otp += str(int(num[odd])**2)

print(otp[0:4])


'''
I/P : 4365188 
Separate even place integer i.e. 3 5 8 
Square : 9 25 64
1st 4 digit : 9256    
'''














