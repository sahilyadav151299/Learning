"use strict";
// By default value starts from 0
var Directions;
(function (Directions) {
    Directions[Directions["up"] = 0] = "up";
    Directions[Directions["down"] = 1] = "down";
    Directions[Directions["left"] = 2] = "left";
    Directions[Directions["right"] = 3] = "right";
})(Directions || (Directions = {}));
console.log(Directions.up); // 0
console.log(Directions['down']); // 1
console.log(Directions[2]); // left
console.log(Directions.right); // 3
// String types
var DirectionsStr;
(function (DirectionsStr) {
    DirectionsStr["up"] = "Up";
    DirectionsStr["down"] = "Down";
    DirectionsStr["left"] = "Left";
    DirectionsStr["right"] = "Right";
    DirectionsStr[DirectionsStr["count"] = 4] = "count";
})(DirectionsStr || (DirectionsStr = {}));
console.log(DirectionsStr);
