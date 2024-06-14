const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split(' ');

const a = input[0].split('').reverse();
const b = input[1].split('').reverse();

console.log(Math.max(a.join(''),b.join('')));

