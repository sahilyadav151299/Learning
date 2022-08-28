# 1) An exception is an unusual condition in a program resulting in the interruption in the flow.
# 2) Therefore, an exception is the run-time errors that are unable to handle.
# 3) An exception is a Python object that represents an error.
# 4) Python provides a way to handle the exception so that the code can be executed smoothly.
# 5) Python has many built-in exceptions that enable our program to run without interrupt.

try:
    print("Run this code")
except:
    print("Run this code if error occurred")
else:
    print("Run this code if no error occurred")
finally:
    print("Always run this code")
