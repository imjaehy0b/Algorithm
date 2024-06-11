const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

let n = +input[0];
let arr = input[1].split(' ');
let v = +input[2];
let result=0;
for(let num of arr){
    if(+num === v){
        result++;
    }
}
console.log(result);