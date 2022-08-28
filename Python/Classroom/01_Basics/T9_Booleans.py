# 1) Boolean represents either True or False value.

# 2) Any conditional statement returns True/False.

a = 8
print(10 > a)      # True
print(10 == a)     # False
print(10 < a)      # False

# 3) True values, Almost any value is evaluated as True, if it has sort of content

print(bool(1015.450))       # Any number, except 0
print(bool('String'))       # Any string, except empty string ''
print(bool([10, 20]))       # Any list, except empty []
print(bool((10, 20)))       # Any tuple, except empty ()
print(bool({10, 20}))       # Any set, except empty {}
print(bool({10: 20}))       # Any dictionary, except empty {key:value}

# 4) False values are having no content in it

print(bool(False))
print(bool(None))
print(bool(0))
print(bool(""))
print(bool([]))
print(bool({}))
print(bool(()))
