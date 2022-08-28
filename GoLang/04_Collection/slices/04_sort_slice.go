package main

import (
	"fmt"
    "sort"
)

func main() {
	
	strs := [] string { "c", "a", "b"}
	sort.Strings(strs)
	fmt.Println(strs)				// a, b, c

	ints := [] int { 7, 2, 4}
	sort.Ints(ints)
	fmt.Println(ints)				// 2, 4, 7

	s := sort.IntsAreSorted(ints)
	fmt.Println(s)					// true
}
