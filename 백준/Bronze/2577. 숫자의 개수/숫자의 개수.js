const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const a = +input[0];
const b = +input[1];
const c = +input[2];

let num = (a * b * c).toString().split('');

let numArr = Array.from({length:10},(_,index)=>0);



for(let i=0; i<num.length; i++){
    let ch = num[i];
    numArr[ch] += 1;
}

console.log(numArr.join('\n'))