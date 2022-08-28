# 1) The with statement was introduced in python 2.5.
# 2) The with statement is useful in the case of manipulating the files.
# 3) The with statement provides the guarantee to close the file.
# 4) If break, return or exception occurs within a block, it itself closes the file.

with open('file1.txt', 'w') as f:
    f.write('This is a try to perform operation using with \n')
    f.write('This is a try to perform operation using with \n')
    f.write('This is a try to perform operation using with \n')
    f.write('This is a try to perform operation using with \n')
    f.close()


