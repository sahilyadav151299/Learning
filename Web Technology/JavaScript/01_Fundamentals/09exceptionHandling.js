let result = 0;

function referenceError() {
    try {
        result = x / 0;
    } catch (error) {
        handleError(error);
    }
}

function rangeError() {
    try {
        result.toPrecision(200);
    } catch (error) {
        handleError(error);
    }
}

function handleError(error) {

    console.log(error.name + " : " + error.message);
}

referenceError();
rangeError();