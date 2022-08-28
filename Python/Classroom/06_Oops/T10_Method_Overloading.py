class Calculator:
    def sum(self, n1=None, n2=None, n3=None):
        res = 0

        if n1 != None and n2 != None and n3 != None:
            res = n1 + n2 + n3
        elif n1 != None and n2 != None:
            res = n1 + n2
        elif n1 != None:
            res = n1
        else:
            res = 0

        return res


opr1 = Calculator()

print(opr1.sum(10, 20, 30))
print(opr1.sum(20, 30))
print(opr1.sum(30))
print(opr1.sum())

