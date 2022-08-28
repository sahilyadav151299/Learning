function errorGenerater() {

    try {
        result = x / 10;
    } catch (error) {
        throw new Error('error messgage');
    }
}


function handleError() {
    try {
        errorGenerater();
    } catch (error) {
        console.log(error.name);
    }
}

handleError();