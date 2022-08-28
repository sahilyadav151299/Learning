# 1) pip install mysql-connector-python
# 2) Written in pure python, hence slow
# 3) (C:\Anaconda3) C:\Users\sahil_yadav>pip install mysql-connector-python

import mysql.connector
from mysql.connector import Error

conn = mysql.connector.connect(host = 'localhost', user='root', password = 'root@1234', database = 'database_2.db')

cursor = conn.cursor()

cursor.execute('SELECT * FROM student')
records = cursor.fetchall()
print(records)

conn.commit()