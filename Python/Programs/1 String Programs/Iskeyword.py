import keyword

keys = input().split(',')

for k in keys:
    if keyword.iskeyword(k):
        print('{} is a keyword'.format(k))
    else:
        print('{} is not a keyword'.format(k))


