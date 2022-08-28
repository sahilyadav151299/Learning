string = input('Enter a string : ')
sub = input('Enter a sub string : ')
count = 0
sub_l = len(sub)
for i in range(0,len(string)):
    word = string[i:sub_l]
    if sub in word:
        count += 1
    sub_l += 1

print(count)

'''
1) Enter string and a sub string
2) Count sub string occurance in string
3) String letters are Case-Sensitive

I/P : ABCDCDC
      CDC
      
O/P : 2      
'''






















