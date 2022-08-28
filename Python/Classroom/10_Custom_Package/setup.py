from setuptools import setup, find_packages

VERSION = '0.0.1'
DESCRIPTION = 'Math package'
LONG_DESCRIPTION = 'This is a math package with add(), sub(), div(), and mul() functions'

# setting up the package

setup(
    name = 'math_package',
    version = VERSION,
    author = 'Sahil Yadav',
    author_email = 'sahilyadav@persistent.com',
    description = DESCRIPTION,
    long_description = LONG_DESCRIPTION,
    packages =find_packages(),
    install_requires = [], # any additional package that needs to be installed
    keywords = ['python', 'math package'],

    classifiers = [
        "Development Status :: 3 - Alpha",
        "Intended Audience :: Education",
        "Programming Language :: Python :: 2",
        "Programming Language :: Python :: 3",
        "Operating System :: MacOS :: MacOS X",
        "Operating System :: Microsoft :: Windows"
    ]
)

# On Anaconda prompt go inside your package directory
# In this case -
# F:\Python\Python Class\11 Custom Package
# Now execute -
# python setup.py sdist bdist_wheel
# F:\Python\Python Class\11 Custom Package>python setup.py sdist bdist_wheel
# Now you can upload your package here - pip.org