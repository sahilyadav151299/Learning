# Custom error class
class ErrorInCode(Exception):

    def __init__(self, *args):
        if args:
            self.message = args[0]
        else:
            self.message = None

    def __str__(self):
        if self.message:
            return "ErrorInCode: {0}".format(self.message)
        else:
            return "ErrorInCode: Something went wrong"

# Raise error without message
try:
    raise ErrorInCode
except ErrorInCode as e:
    print(e)

# Raise error with message
try:
    raise ErrorInCode('Custome error raised')
except ErrorInCode as e:
    print(e)