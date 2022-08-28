# 1) break with while

num = int(input('Enter a number : '))

while True:
    if num == 5 or num > 10:
        break
    print(num)
    num += 1

# 2) break with for

num = int(input('Enter a number : '))

for i in range(2, (num//2) + 1):
    if num % i == 0:
        print('Not prime')
        break
else:
    print('Prime number')