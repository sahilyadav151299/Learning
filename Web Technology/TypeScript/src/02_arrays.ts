// 1) Using square brackets

let ids : number [] = [101, 102, 103, 104]
let data : any [] = [101, true, "Hello"]


// 2) Tuple array

let emp : [number, string] [] = []

emp = [
    [101, 'Sahil'],
    [102, 'Vishal'],
    [103, 'Sonu']
]


// 3) Generic array 

let fruits : Array<string> = ['Apple', 'Banana', 'Orange']

let lang : Array<string>

lang = ['Java', 'Go', 'JS', 'TS', 'Python']


// 4) Multi-type array

let data1 : (string | number)[] = ['Apple', 2]
 
let data2 : Array<string | number> = ['Banana', 2] 

