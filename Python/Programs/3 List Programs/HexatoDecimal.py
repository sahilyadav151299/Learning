dict = {

    '0':0, '1':1, '2':10, '3':11, '4':100,'5':101,
    '6':110, '7':111, '8':1000, '9':1001, 'A':1010,
    'B':1011, 'C':1100, 'D':1101,'E':1110, 'F':1111
}

hexa = input()
binary = ''
decimal = 0

for key in hexa:
    val = dict[key]
    binary += str(val)

binary = binary
power = len(binary)-1

for bit in binary:
    decimal += int(bit)*(2**power)
    power -= 1

print('Hexa : '+hexa)
print('Binary : '+binary)
print('Decimal : '+decimal)


'''
Number System 
Hexadecimal to Decimal
'''

