string = '0asd12f9asd1243'
a = len(string)//2
p = string[:a]
s = string[a:]
l = 0
w = ''

for i in range(len(s)):
    Str = ''
    for j in range(i,len(s)):
        Str = Str + s[j]
        if Str in p:
            if len(Str) > l:
                l = len(Str)
                w = Str
print(w)
print(l)

















