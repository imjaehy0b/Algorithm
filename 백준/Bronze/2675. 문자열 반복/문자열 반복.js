const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const testCase = +input[0];
let arr = [];
for(let i=0; i<testCase;i++){
    const [cnt, str] = input[i+1].split(' ');

    for(let j of str){
        arr.push(j.repeat(cnt));
    }

    console.log(arr.join(''));
    arr = [];
}
