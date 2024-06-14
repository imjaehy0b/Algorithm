const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const subject = +input[0];
const score = input[1].split(' ').map(Number);
const max = Math.max(...score);

let sum = 0;
for(let i of score){
    sum += i/max*100;
}

console.log(Math.floor((sum/subject)*100)/100)