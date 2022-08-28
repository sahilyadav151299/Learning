import sqlite3

try:
    # connect to database
    conn = sqlite3.connect('database_1.db')

    # create a cursor for connected database
    cursor = conn.cursor()

    # execute create table
    cursor.execute('CREATE TABLE student (id integer, name text)')

    # execute insert data
    cursor.execute('INSERT INTO student (id, name) VALUES (101, "Sahil")')
    cursor.execute('INSERT INTO student (id, name) VALUES (102, "Tokyo")')

    # execute insert data using variable
    std_id = 103
    std_name = 'Berlin'

    cursor.execute('INSERT INTO student (id, name) VALUES (?, ?)', (std_id, std_name))

    # execute select records, fetch all at once
    data = cursor.execute('SELECT * FROM student')

    print(data.fetchall())     # return all the records
    print(data.fetchall())     # return [] as reached at end

    # loop through for loop
    data = cursor.execute('SELECT * FROM student')
    records = data.fetchall()

    for row in records:
        print('Id :', row[0], end=' ')
        print('Name : ' + row[1])

    # execute select & fetch one-bye-one
    data = cursor.execute('SELECT * FROM student')

    print(data.fetchone())
    print(data.fetchone())
    print(data.fetchone())
    print(data.fetchone())


except Exception as e:
    print(e)

finally:
    # cursor.execute('DROP TABLE student')
    # commit operations on database
    conn.commit()
    # close connection
    conn.close()


# Sqlite CMD

# 1) Execute sqlite from cmd
# D:\OneDrive - Persistent Systems Limited\L&D\Python\sqlite3>sqlite3.exe

# 2) Connect with database
# D:\OneDrive - Persistent Systems Limited\L&D\Python\sqlite3>sqlite3.exe database_1.db

# 3) Show databases
# sqlite> .databases
# main: D:\OneDrive - Persistent Systems Limited\L&D\Python\sqlite3\database_1.db r/w

# 4) Perform operations
#  SELECT * FROM student;




