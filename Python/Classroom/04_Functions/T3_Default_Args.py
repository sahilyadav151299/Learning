# If we call the function without parameter, It uses the default values

# 1) Example
def function1(country = 'India'):
    print(country)

function1()
function1('England')


# 2) Example
def function2(name, age = 18):
    print('Name : ', name)
    print('Age  : ', age)

function2('Sahil')
function2('Sahil', 21)
function2(name = 'Sahil', age = 21)
