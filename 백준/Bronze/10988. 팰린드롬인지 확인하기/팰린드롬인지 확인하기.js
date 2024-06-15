const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

let str = input;
let strRevers = input.split('').reverse();

console.log(str===strRevers.join('') ? 1 : 0)