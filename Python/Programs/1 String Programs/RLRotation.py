def RightRotation(string,ch):
    print('RightRotation : ',end='')
    print(string[-ch:]+string[:-ch])

def LeftRotation(string,ch):
    print('LeftRotation : ',end='')
    print(string[ch:]+string[0:ch])


string = 'welcome'  # ome welc  # come wel  ch = 3
ch = int(input('No : '))
RightRotation(string,ch)
LeftRotation(string,ch)