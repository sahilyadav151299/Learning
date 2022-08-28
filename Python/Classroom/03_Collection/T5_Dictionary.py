# 1) Unordered
# 2) Changeable or Mutable
# 3) No duplicate values
# 4) Indexed
# 5) Denoted by { key : value }

info = {
    'name' : 'Sahil',
    'age'  : 21,
    'dob'  : '15/12/1999'
}

# 1) Looping over dictionary

for key in info:
    print(key, end='  ')

for value in info.values():
    print(value, end='  ')

print()
for key, value in info.items():
    print(key, ':', value)

for key, value in sorted(info.items()):
    print(key, ':', value)

# 2) Access, Add, Update Items

val1 = info['name']
val2 = info.get('name')
print(val1, val2)

info['name'] = 'Afreen'
info['height'] = '5 ft'
print(info)

# 3) Remove, Pop, Clear, Delete items

print('Age :', info.pop('age'))
print('Last :', info.popitem())
info.clear()
print(info)
del info

# 4) Copying of dictionary

d1 = { 1: 10 }

d2 = d1.copy()
print(d2)

d3 = dict(d2)
print(d3)

# 5) Nested Dictionary

child1 = {
    'name' : 'ABC',
    'age' : 21
}

child2 = {
    'name' : 'DEF',
    'age' : 21
}

myFamily = {
    'c1' : child1,
    'c2' : child2
}

# 6) Or we can write it like this

empData = {
    'e1' : {'Name': 'Sahil', 'Age': 21},
    'e2' : {'Name': 'Sonu', 'Age': 21},
    'e3' : {'Name': 'Afreen', 'Age': 21}
}

for key in empData:
    print("EmpName :", empData[key]['Name'], end=', ')
    print("EmpAge :", empData[key]['Age'], end='\n')