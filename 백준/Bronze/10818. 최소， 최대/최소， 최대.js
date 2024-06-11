const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const cntNum = +input[0];
const arr = input[1].split(' ');

const max = Math.max(...arr);
const min = Math.min(...arr);

console.log(min,max);