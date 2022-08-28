// Empty Object         let person = {};        

let person = {
    fname : 'Sahil',
    lname : 'Yadav',
    age   : 21,
    
    fullName : function (){
        return this.fname + " " +this.lname;
    },

    nameLength(){
        return this.fname.length + this.lname.length;
    }
};

console.log(person);
console.log(typeof person);
console.log(person.fname);
console.log(person['lname']);
console.log(person.fullName());
console.log(person.nameLength());

function incermentAge(p){
    p.age++;
}

console.log(person.age);
incermentAge(person);       // Passing object to function
console.log(person.age);