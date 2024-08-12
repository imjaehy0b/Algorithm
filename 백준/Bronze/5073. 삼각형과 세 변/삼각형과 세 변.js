const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
input.pop();

let answer = [];
for(let el of input){
    let arr = el.split(' ').map(Number).sort((a, b) => a - b);
    let nums = new Set(arr);

    if(arr[0]+arr[1] <= arr[2]){
        answer.push('Invalid');
        continue;
    }
    if(nums.size === 1){
        answer.push('Equilateral');
    }else if(nums.size === 2){
        answer.push('Isosceles');
    }else{
        answer.push('Scalene');
    }
}

console.log(answer.join('\n'));