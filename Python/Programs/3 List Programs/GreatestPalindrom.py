n = int(input())
while True:
    rev = int(str(n)[::-1])
    if rev==n:
        print(int(n))
        break
    n+=1

'''
Write a python function nearest_palindrome ()
Which can accepts a number and return the nearest greater
palindrome number .
Input : 123000 --> 123321
Input : 12331 --> 12421
'''