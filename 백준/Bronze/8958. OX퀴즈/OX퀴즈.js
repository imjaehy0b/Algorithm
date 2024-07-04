const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

let count = +input[0];
let score = 0;
let oxCheck = [];
let newArr = [];
for(let i=1; i<=count; i++){
    const arr = input[i].split('');
    
    //O인지 x인지 판단.
    //x면 0점 후 정답배열에 입력
    //O면 직전 정답배열이 O인지 아닌지 판단후
    //o라면 기존값+1 을 더하고 x라면 그냥 +1
    
    for(let j=0; j<arr.length; j++){
        if(arr[j]==='O'){
            oxCheck.push('O');
        }else{
            oxCheck.push('X');
        }
        
        if(oxCheck[oxCheck.length-1]==='O'){
            score += oxCheck.length;
        }else{
            oxCheck = [];
        }
    }
    oxCheck = [];
    newArr.push(score);
    score = 0;
}

console.log(newArr.join('\n'));