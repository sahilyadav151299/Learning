interface Emplyoee{

    readonly empId: number,     // readonly property
    empName: string,
    empAge?: number,            // optional property
}

let emp1 : Emplyoee = { 

    empId: 101,
    empName: 'Sahil',
    empAge: 20
}

console.log(emp1.empId)
console.log(emp1.empName)
console.log(emp1.empAge)

let emp2 : Emplyoee = { 

    empId: 102,
    empName: 'Sahil'
}

console.log(emp2.empId)
console.log(emp2.empName)