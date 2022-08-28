// 1) JS object

const user1 = {

    id: 101,
    name: 'Sahil'
}

// 2) TS object

const user2 : {

    id: number,
    name: string
} = {
    id: 2,
    name: 'Vishal'
}

// 3) Object type same as interfacse

type User = {

    id: number,
    name: string
}

const user3 : User = {

    id: 3,
    name: 'Sonu'
}