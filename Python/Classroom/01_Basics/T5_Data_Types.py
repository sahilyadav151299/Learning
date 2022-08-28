# Data type is set when we assign a value to a variable
# But we can use construction functions to define variable

# 1) Text type      -   str
# 2) Numeric type   -   int, float, complex
# 3) Sequence type  -   list, tuple, range
# 4) Mapping type   -   dict
# 5) Set type       -   set, frozenset
# 6) Boolean type   -   bool (True, False, None)
# 7) Binary type    -   bytes, bytearray, memoryview

var1 = str('Hello Python')
print(var1)                          # Hello Python
print(type(var1))                    # <class 'str'>
print(isinstance(var1, str))         # determines the dt of an object

var2 = int(123456789)
print(var2)                          # 123456789
print(type(var2))                    # <class 'int'>

var3 = float(3.14)
print(var3)                          # 3.14
print(type(var3))                    # <class 'float'>

var4 = complex(20 + 54j)
print(var4)                          # (20+54j)
print(type(var4))                    # <class 'complex'>

var5 = range(6)
print(var5)                          # range(0, 6)
print(type(var5))                    # <class 'range'>

var6 = list(['A', 'B', 'C'])
print(var6)                          # ['A', 'B', 'C']
print(type(var6))                    # <class 'list'>

var7 = tuple(('A', 'B', 'C'))
print(var7)                          # ('A', 'B', 'C')
print(type(var7))                    # <class 'tuple'>

var8 = set({'A', 'B', 'C'})
print(var8)                          # {'A', 'B', 'C'}
print(type(var8))                    # <class 'set'>

var9 = dict({'key': 'value'})
print(var9)                          # {'key': 'value'}
print(type(var9))                    # <class 'dict'>

var10 = frozenset({'A', 'B', 'C'})
print(var10)                          # frozenset({'B', 'C', 'A'})
print(type(var10))                    # <class 'frozenset'>

var11 = bool(True)
print(var11)                          # True
print(type(var11))                    # <class 'bool'>

var12 = b'Hey'
print(var12)                          # b'Hey'
print(type(var12))                    # <class 'bytes'>

var13 = bytearray(5)
print(var13)                          # bytearray(b'\x00\x00\x00\x00\x00')
print(type(var13))                    # <class 'bytearray'>

var14 = memoryview(bytes(5))
print(var14)                          # <memory at 0x000001C772387DC0>
print(type(var14))                    # <class 'memoryview'>
