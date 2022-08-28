// use separate JS to make code clean & clear
// use separate JS to make reusable function

// taking input from the user with default value 0
// prompt returns stirng input

// Number vs parseInt : typecast

var n1 = Number(prompt("Enter n1 number : ", 0))
var n2 = parseInt(prompt("Enter n2 number : ", 0))

function add(n1, n2){
    return "Add : " + (n1 + n2)
}

function sub(n1, n2){
    return "Sub : " + (n1 - n2)
}

var addResult = add(n1, n2)
var subResult = sub(n1, n2)

document.getElementById("spanAdd").innerText = addResult
document.getElementById("spanSub").innerText = subResult

// returns true or false
if( confirm("Do you want to delete this folder") )
alert("You selected OK!")
else
alert("You cancelled!")
