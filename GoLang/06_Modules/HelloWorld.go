package main

import (	
	"fmt" 								// built in pkg : C:\Program Files\Go\src
	"golang.org/x/example/stringutil"   // third party  : C:\Users\sahil_yadav\go\pkg\mod\
	"myExample.com/DAL"				    // user defined : module name from go.mod + package path 
	s1 "myExample.com/DAL/SUBDAL"       // user sub-pkg : with pkg alias
	// s2  "myexample.com/File/SUBDAL"  can use alias if 2 sub-folder have same name
)

// init() is called before calling main func
// it will be called only once, we can't call it explicitly
// used for one time initialization of members
// first call imported package init() : child --> parent

func init() {
	fmt.Println("init of main is called...")
}

func main() {

	fmt.Println(stringutil.Reverse("Persistent"))

	// DAL.readDB() : Error unexported name
	
	DAL.WriteDB()
	s1.Method1()
	
	// can use without import from support.go
	// call if 2 main pkg : go run .\HelloWorld.go .\Support.go
	GetData()
}

// 1) Executable package (part of main package)
// 2) Reusable package
//		2.1) User defined
//		2.2) Third party
//		2.3) In-built

// For download third party package first generate module file inside pwd
// go mod init myExample.com (can have any package name)

// Now download any third party package like this
// Search for package : https://pkg.go.dev/
// go get golang.org/x/example/stringutil

// To download all the third-party package used before in project
// Use this command inside directory having mod file
// PS D:Path\L&D\GoLang\06_Modules_Go\Modules> go get
// go get : download all packages available in go.mod
