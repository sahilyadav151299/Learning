pre = input()
suf = pre[::-1]

count = 0

for i in range(len(pre)):
    if pre[i]==suf[i]:
        count += 1
    else:
        if i==0:
            count=-1
        break

print(count)

'''
A non empty str containing only alphabets . print the longest prefix
in str which is same as suffix.
Prefix and suffix should not be overlapped
Print -1 if no prefix exits which is also the suffix without suffix
without overlap

Do case sensitive comparison wherever necessary
Position start from 1.
Input :”xxAbcxxAbcxx” o/p :2
Input :”Racecar” o/p:-1
'''
