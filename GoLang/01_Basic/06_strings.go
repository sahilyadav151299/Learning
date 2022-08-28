package main

import (
	"fmt"
	// alias of sting package
	s "strings"
)

func main() {

	// interpreted string, \n as a new line

	var fullName = "Sachin \n Tendulkar"

	fmt.Println(fullName)
	
	// raw String, prints everything
	// multi-line string is possible

	var message = ` Hey "Sachin" 'Tendulkar'!
	How was your day !`

	fmt.Println(message)

	// string operations
	// var holding function definition
	var p = fmt.Println

	p("Contains	  ", s.Contains("test", "es"))
	p("Count      ", s.Count("test", "t"))
	p("HasPrefix  ", s.HasPrefix("test", "te"))
	p("HasSuffix  ", s.HasSuffix("test", "st"))
	p("Index	  ", s.Index("test", "e"))
	p("Join		  ", s.Join([]string{"a", "b"}, "-"))
	p("Repeat	  ", s.Repeat("a", 5))
	p("Replace    ", s.Replace("foo", "o", "0", -1))
	p("Replace    ", s.Replace("foo", "o", "0", 1))
	p("Split	  ", s.Split("a-b-c-d-e", "-"))
	p("ToLower    ", s.ToLower("TEST"))
	p("ToUpper    ", s.ToUpper("test"))	
	p("Length     ", len("hello"))
	p("Char       ", "hello"[1])

}
