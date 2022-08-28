// In-built Module  ---- Comes with Node installation
// os | fs | http | events | https | assert

const osObj = require('os')

console.log('OS Type - ' + osObj.type())
// OS Type - Windows_NT
console.log('Home Dir - ' + osObj.homedir())
// Home Dir - C:\Users\sahil_yadav
console.log('Host Name - ' + osObj.hostname())
// Host Name - HJNZL002009
console.log('Total Memory - ' + osObj.totalmem())
console.log('Free Memory - ' + osObj.freemem())
console.log('Deafult Dir For Temp Files - ' + osObj.tmpdir())
// C:\Users\SAHIL_~1\AppData\Local\Temp
console.log('OS Platform - ' + osObj.platform())
// win32
console.log('Array of CPU Logical Core - ' - osObj.cpus())



// 1) Open CMD 
// 2) Go in PWD : D://path//Node>
// 3) Type node 02_os.js


