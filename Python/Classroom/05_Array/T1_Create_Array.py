from array import *

# Type codes for different data types :

# 'b'       signed char              1 byte
# 'B'       unsigned char            1 byte

# 'i'       signed int               2 byte
# 'I'       unsigned int             2 byte
# 'h'       signed short int         2 byte
# 'H'       unsigned short int       2 byte
# 'l'       signed long int          2 byte
# 'L'       unsigned long int        4 byte

# 'f'       float                    4 byte
# 'd'       double                   8 byte


vals = array('i', [1, 2, 3, 4, 5, -6, -4, -3])

print(vals)

print(vals.buffer_info())       # size of array

print('Using Vals')
for val in vals:
    print(val, end= ' ')

print('\nUsing Range')
for i in range(len(vals)):
    print(vals[i], end=' ')


