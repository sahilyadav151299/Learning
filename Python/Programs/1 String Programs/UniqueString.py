stg = input()
final = ''

for i in range(len(stg)):
    if stg[i].lower() in final or stg[i].upper() in final:
        break
    else:
        final += stg[i]

print(final)

'''
A string is given we have to find the longest substring which is
unique (that has no repetition ) and min size is 3.
If more than one sub string is found with max length the we have
to print one which appered first in thw string
If no substring is present which matches the condition then we
have to print -1;
Ex :input : “A@bcd1abx”
Output : “A@bcd1”
'''
