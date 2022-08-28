x = 'hello bythgonn this is pythonn class'
le = []
y = x.split()

for i in y:
    le.append(len(i))

for i in range(len(y)):
    m = max(le)
    idx = le.index(m)
    s = y[idx]
    for j in s:
        c = s.count(j)
        if c>1:
            le.pop(idx)
            y.pop(idx)
            break
    else:
        if len(s)>3:
            print(s)
        else:
            print(-1)
        break











