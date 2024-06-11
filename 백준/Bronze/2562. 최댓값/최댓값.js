const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
let max = Math.max(...input);
let idx = input.map(Number).indexOf(max);


console.log(max);
console.log(idx+1);