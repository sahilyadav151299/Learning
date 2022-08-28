# In Python, The file may be in the text or binary format,
# and each line of a file is ended with the special character.

#   w       -->     open file in write mode, if exists overwrite otherwise create a new file, file pointer at start
#   r       -->     default mode if no mode specified, open file to read-only mode, file pointer at start
#   a       -->     open file in append mode, file pointer at last content, create a new file if not exists
#   w+      -->     open file in write-read mode, file pointer at start, create new file if not exists
#   r+      -->     open file in read-write mode, file pointer at start
#   a+      -->     open file in append-read mode, file pointer at end, create new file if not exists

# Binary file mode : wb, rb, ab, wb+, rb+, ab+

# 1) return a file object

file_object1 = open('file1.txt', 'w')
file_object2 = open('file2.txt', 'a')


# 2) write into a file

file_object1.write('Hey there!\n')
file_object1.write('Hey there!\n')

file_object2.write('Do not overwrite!\n')
file_object2.write('''Understood ?
---------------------\n''')


# 3) close the file

file_object1.close()
file_object2.close()

