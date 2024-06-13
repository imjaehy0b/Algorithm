const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const str = input[0];
const num = +input[1]-1;

console.log(str.charAt(num));