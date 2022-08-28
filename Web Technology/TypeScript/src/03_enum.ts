// By default value starts from 0

enum Directions{

    up,
    down,
    left,
    right
}

console.log(Directions.up)       // 0
console.log(Directions['down'])  // 1
console.log(Directions[2])       // left
console.log(Directions.right)    // 3

// String types

enum DirectionsStr{
    up = 'Up',
    down = 'Down',
    left = 'Left',
    right = 'Right',
    count = 4
}

console.log(DirectionsStr)