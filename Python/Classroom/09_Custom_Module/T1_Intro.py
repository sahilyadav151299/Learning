# There are 4 ways of module import

# 1) import math                  -->   math.pow()
# 2) import math as m             -->   m.pow()
# 3) from math import pow, sqrt   -->   pow(), sqrt()
# 4) from math import *           -->   pow(), sqrt(), floor()

# Advantages of using modules
# 1) Code reused
# 2) Namespace
# 3) Partitioning
# 4) Shared Variable (mutable)

import sys
modulePath = sys.path       # returns all the path where python looks for imported module
print(modulePath)           # different path on different environment IDLE,Anaconda,PyCharm





