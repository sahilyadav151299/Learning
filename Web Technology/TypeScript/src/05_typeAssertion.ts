let cid : any = '1'

// Type assertion
let cid1 = <number> cid
let cid2 = cid as number

console.log(typeof(cid))
console.log(typeof(cid1))
console.log(typeof(cid2))