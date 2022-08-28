# 1) Zip returns key:value pair for dict()
# 2) Otherwise pair of tuple inside list(), set() or tuple()

nameList = ['Sahil', 'Afreen', 'Shubham']
ageList = [21, 21, 22]

detailsDict = dict(zip(nameList, ageList))  # key:value pair inside dictionary
print(detailsDict)

detailsList = list(zip(nameList, ageList))  # tuple inside list
print(detailsList)

detailsTuple = tuple(zip(nameList, ageList))  # tuple inside tuple
print(detailsTuple)

detailsSet = set(zip(nameList, ageList))  # tuple inside set
print(detailsSet)

