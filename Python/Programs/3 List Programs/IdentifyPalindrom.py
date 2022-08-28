o_string = input("Enter Number : ")
r_string = o_string[::-1]

while True:
    o_sum = int(o_string) + int(r_string)
    r_sum = int(str(o_sum)[::-1])

    if o_sum == r_sum:
        print(o_sum)
        break
    else:
        o_string = str(o_sum)
        r_string = str(r_sum)

'''
For a given +ve num identify the palindrom formed by performing the following opr's.
1) Add num and it's reverse
2) Check whether the sum is palindrom or not.
3) If not add the sum and it's reverse and repeat tha process untill a palindrom is obtained.

I/P : 195
O/P : 9339
'''

