const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split(' ');

const n = +input[0];
const m = +input[1];

if(n===m){
    console.log(0);
}

let min = Math.min(n,m);
let max = Math.max(n,m);
let cnt = 0;
while(min != max){
    min++;
    cnt++;
}

console.log(cnt);