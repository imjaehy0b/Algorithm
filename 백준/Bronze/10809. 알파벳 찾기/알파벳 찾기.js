const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const str = input[0];
const arr = [];
for(let i=0; i<26;i++){
    let a = String.fromCharCode(97+i)
    
    arr.push(str.indexOf(a));
}

console.log(arr.join(' '))