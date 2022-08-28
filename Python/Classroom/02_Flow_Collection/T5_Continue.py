# 1) continue with while loop

num = int(input('Enter a number : '))

while num <= 10:
    if num % 2 == 1:
        num += 1
        continue
    print(num)
    num += 1
else:
    print('Even only')

# 2) continue with for loop

for i in range(0, num):
    if i % 2 == 0:
        continue
    print(i)
else:
    print('Odd only')