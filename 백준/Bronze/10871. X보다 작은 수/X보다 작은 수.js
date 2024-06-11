const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

let num = input[0].split(' ');
let arr = input[1].split(' ');

let result = arr.filter(item=> +item < +num[1]);

for(let i of result){
    console.log(i);
}