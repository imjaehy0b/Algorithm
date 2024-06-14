const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const length = input[0];

const arr = input[1].split('').map(Number);

let sum = arr.reduce((p,n)=>p+n,0);

console.log(sum)