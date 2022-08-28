# Finally block always get executed

try:
    print("Connect with database")
    print("insert")
    print("update")
    print("delete")
    print("commit")
except:
    print("If any error occurred in between")
    print("rollback all the operation")
finally:
    print("Whatever happend always close the connection")
