# 1) Allow us to pass arguments as a key = value pair.
# 2) This way the order of the arguments doesn't matter but name matters.

def info(name, age, dob, nationality = 'India'):
    print('Name          : ', name)
    print('Age           : ', age)
    print('Date of Birth : ', dob)
    print('Nationality   : ', nationality)

info(name='Sahil', age=21, dob='15/12/1999')


