# A RegEx is a sequence of characters that forms a search pattern.
# RegEx can be used to check if a string contains the specified search pattern.

import re

# 1) Metacharacters are chars with a special meaning

#   .	    Any character (except newline character)	    "he..o"
#   ^	    Starts with	                                    "^hello"
#   $	    Ends with	                                    "planet$"
#   *	    Zero or more occurrences	                    "he.*o"
#   +	    One or more occurrences	                        "he.+o"
#   ?	    Zero or one occurrences	                        "he.?o"
#   {}	    Exactly the specified number of occurrences	    "he{2}o"
#   |	    Either or	                                    "falls|stays"


# Search for a sequence starts with "he + followed by any 2 char + o"
txt = "hello planet"
x = re.findall("he..o", txt)
print(x)

# Check if the string starts with 'hello'
x = re.findall("^hello", txt)
if x:
  print("Yes, the string starts with " + x[0])

# Check if the string ends with 'planet'
x = re.findall("planet$", txt)
if x:
  print("Yes, the string ends with " + x[0])

# Search for a sequence that starts with "he" + followed by 0 or more (any) char + "l"
x = re.findall("he.*l", txt)
print(x)

# Search for a sequence that starts with "he" + followed by 1 or more (any) char + "o"
x = re.findall('he.+o', txt)
print(x)

# Search for a sequence that starts with "he" + followed by 0 or 1 (any) char + "o"
x = re.findall("he.?o", txt)
print(x)

# Search for a sequence that starts with "he" + followed exactly 2 (any) char + "o"
x = re.findall("he.{2}o", txt)
print(x)

# Check if the string contains either "falls" or "stays"
txt = "The rain in Spain falls mainly in the plain!"
x = re.findall("falls|stays", txt)
if x:
  print(x)

print('-' * 50)

# 2) Special Sequence is a \ followed by one of the char,
#    They returns a match

# \A	if chars are at the beginning of the string	                        "\AThe"
# \b	if chars are at the beginning or at the end of a word	            r"\bain"r"ain\b"
# \B	if chars are present, but NOT at the beginning|end of a word     r"\Bain" r"ain\B"
# \d	if the string contains digits (numbers from 0-9)	                "\d"
# \D	if the string DOES NOT contain digits	                            "\D"
# \s	if the string contains a white space character	                    "\s"
# \S	if the string DOES NOT contain a white space character	            "\S"
# \w	if the string contains any word characters (a-Z, 0-9, _)	        "\w"
# \W	if the string DOES NOT contain any word characters	                "\W"
# \Z	if chars are at the end of the string	                            "Spain\Z"


# Check if the string starts with "The"
txt = "The rain in Spain"
x = re.findall("\AThe", txt)
print(x)

# Check if "ain" is present at the start of a WORD
x = re.findall(r"\bain", txt)
print(x)

# Check if "ain" is present at the end of a WORD
x = re.findall(r"ain\b", txt)
print(x)

# Check if "ain" is present, but NOT at the beginning of a word
x = re.findall(r"\Bain", txt)
print(x)

# Check if "ain" is present, but NOT at the end of a word
x = re.findall(r"ain\B", txt)
print(x)

# Check if the string contains any digits from 0-9
x = re.findall('\d', txt)
print(x)

# Return a match at every no-digit character
x = re.findall("\D", txt)
print(x)

# Return a match at every white-space character
x = re.findall("\s", txt)
print(x)

# Return a match at every NON white-space character
x = re.findall("\S", txt)
print(x)

# Return a match at every word character a-Z, 0-9, _
x = re.findall("\w", txt)
print(x)

# Return a match at every NON word character
x = re.findall("\W", txt)
print(x)

# Check if the string ends with "Spain"
x = re.findall("Spain\Z", txt)
print(x)

print('-' * 50)

# 3) A set is a set of characters inside a pair of
#    square brackets [] with a special meaning
#    They returns a match

# [arn]	        where one of the specified chars a|r|n are present
# [a-n]	        for any lower case chars alphabetically between a and n
# [^arn]	    for any character EXCEPT a, r and n
# [0123]    	where any of the specified digits 0|1|2|3 are present
# [0-9]	        for any digit between 0 and 9
# [0-5][0-9]	for any two-digit numbers from 00 to 59
# [a-zA-Z]	    for any chars alphabetically between a-z and A-Z
# [+]	        return a match for any + char in the string

# Check if the string has any a, r, or n char
txt = "The rain in Spain"
x = re.findall('[arn]', txt)
print(x)

# Check if the string has any characters between a and n
x = re.findall("[a-n]", txt)
print(x)

# Check if the string has other characters than a, r, or n
txt = "The rain in Spain"
x = re.findall('[^arn]', txt)
print(x)

# Check if the string has any 0, 1, 2, or 3 digits
x = re.findall("[0123]", txt)
print(x)

# Check if the string has any digits
txt = "8 times before 11:45 AM"
x = re.findall("[0-9]", txt)
print(x)

# Check if the string has any two-digit numbers from 00 to 59
x = re.findall("[0-5][0-9]", txt)
print(x)

# Check if the string has any characters from a-z and A-Z
x = re.findall("[a-zA-Z]", txt)
print(x)

# Check if the string has any + char
x = re.findall("[+]", txt)
print(x)
print('-' * 50)

# 4) RegEx functions

#  findall() returns a list containing all matches
#  The list contains the matches in the order they are found

txt = "The rain in Spain"
x = re.findall("ai", txt)
print(x)

# search() searches the string for a match, and returns a Match object if there is a match.
# If there is more than one match, only the first occurrence of the match will be returned.

x = re.search("\s", txt)
print(x)
print("First white-space character is located at : ", x.start())

# split() function returns a list where the string has been split at each match
x = re.split("\s", txt)
print(x)

# can control the number of occurrences by specifying the maxsplit parameter
x = re.split("\s", txt, 1)
print(x)

# sub() function replaces the matches with the text of your choice
x = re.sub("\s", "---", txt)
print(x)

# can control the number of replacements by specifying the count parameter
x = re.sub("\s", "---", txt, 2)
print(x)

# span() returns a tuple containing the start-, and end positions of the match.
txt = "The rain in Spain"
x = re.search(r"\bS\w+", txt)
print(x.span())

# compile(pattern, flags=0) compile RE pattern with any optional flags and return a regex object

regexp = re.compile("hello")
count = 0
file = open("textfile.txt", 'r')

for line in file.readlines():
    if regexp.search(line):
        count = count + 1

file.close()
print(count)

# match(pattern, string, flags=0) attempt to match RE pattern to string at the beginning with optional flags
# return match object on success, none on failure

m = re.match('hello', 'hello')
if m != None:
    print(m.group())