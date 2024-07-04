const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const a = input[0];
const b = input[1];
const c = input[2];

let num = Number(a)+Number(b)-Number(c);
let str = a+b-c
console.log(num);
console.log(str);