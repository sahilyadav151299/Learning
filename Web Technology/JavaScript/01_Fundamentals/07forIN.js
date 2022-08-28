let person = {
    fname  : 'Sahil',
    lname  : 'Yadav',
    age    : 21,
    gender : 'Male',

    isAdult : function(){
        return (this.age >= 18)?'Yes':'No';
    }
};

for(const key in person){
    console.log(key + " " + person[key]);
}

// Iterates over properties on an object
// Returns key, obj[key] returns value