import T2_MyModule

T2_MyModule.moduleFunction()

# 1) As soon as we execute this script for the first time
#    python creates a __pycache__ folder in PWD
#    and put compiled module for future use as compiled python file

# 2) Untill the imported module doesn't get updated,
#    python doesn't compiled the same module again

# 3) If you will import the same mdoule from different environment with
#    different version of python, then it compiled that module with that version
