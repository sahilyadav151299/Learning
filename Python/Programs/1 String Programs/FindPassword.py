def mostActive(customers):
    uniqe = []
    
    n = len(customers)
    for name in list(customers):
        if name not in uniqe:
            uniqe.append(name)

    uniqe = sorted(uniqe)
    new = []
    for cust in uniqe:
        c = 0
        for name in list(customers):
            if cust == name:
                c += 1
        
        val = (c/n)*100
        if int(val) >= 5:
            new.append(cust)

    return cust

if __name__ == '__main__':

    customers_count = int(input().strip())

    customers = []

    for _ in range(customers_count):
        customers_item = input()
        customers.append(customers_item)

    result = mostActive(customers)

    print('\n'.join(result))
    
