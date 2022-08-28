# MySQLdb -- C wrapper -- faster
# pip install mysqldb-python

import MySQLdb

conn = MySQLdb.connect('localhost', 'root', 'root@1234')

cursor = conn.cursor()

query1 = 'INSERT INTO student (id, name) VALUES (101, "Sahil")'
cursor.execute(query1) # returns inserted records count

std_id = 102
std_name = 'Berlin'

query2 = 'INSERT INTO student (id, name) VALUES (%d, "%s")' % \
         (std_id, std_name)
cursor.execute(query2)

conn.commit()

query3 = 'SELECT * FROM student'
results = cursor.execute(query3)
records = results.fetchall()
print(records)
