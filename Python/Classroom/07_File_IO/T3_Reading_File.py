# 1) Open a file in read mode
file_ptr = open('file1.txt', 'r')


# 2) Read with read(), seek(), tell()
content = file_ptr.read()       # returns whole content, file pointer reached at end
print(content)

ptr_pos = file_ptr.tell()       # returns current file pointer position
file_ptr.seek(0)                # tell file pointer to seek at 0 char position
file_ptr.seek(5)                # tell file pointer to seek at 5 char position

content = file_ptr.read(11)     # read 11 char from 6th position
print(content)
print(type(content))            # <class 'str'>


# 3) Read through for loop
file_ptr.seek(0)

# returns each line
for each_line in file_ptr:
    print(each_line, end='')


# 4) Read using readline()
file_ptr.seek(0)

print('---------' * 5)
print(file_ptr.readline())                  # first line
print(file_ptr.readline(), end='')          # second line
print('---------' * 5)

# 5) Read using readlines()
file_ptr.seek(0)

content = file_ptr.readlines()     # returns list of lines
print(content)

for line in content:
    print(line, end='')


