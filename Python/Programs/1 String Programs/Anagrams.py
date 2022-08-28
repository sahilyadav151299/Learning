s1 = input('S1 : ')
s2 = input('S2 : ')

s1_count = [0]*26
s2_count = [0]*26

for i in range(len(s1)):
    s1_count[ord(s1[i])-97] += 1

for j in range(len(s2)):
    s2_count[ord(s2[j])-97] += 1

delete = 0

for i in range(26):
    delete += abs(s1_count[i]-s2_count[i])

print(delete)

'''
A word is formed by re-arranging the letters of the word
RAM : MAR/RMA/ARM/AMR etc

I/P : cde         O/P : 4 char delete those are not common
      abc          
'''








