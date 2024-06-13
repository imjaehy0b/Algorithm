const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const str = []
for(let a of input){
    str.push(a);
}

console.log(str.join('\n'));