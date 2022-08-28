# 1) Raise exception

try:
    age = int(input("Enter your age : "))

    if age < 18:
        raise ValueError
    else:
        print("Valid age")

except ValueError:
    print("Invalid age")
    print(ValueError)

# 2) Raise exception with message

try:
     num = int(input("Enter a positive integer : "))

     if num <= 0:
         raise ValueError("That is a negative number!")
     else:
         print("Number is : ", num)

except ValueError as e:
     print(e)
     print(ValueError.__str__(e))