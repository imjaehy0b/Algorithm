const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const conditionNum = input[0].split(' ').map(Number);
const n = conditionNum[0];
const m = conditionNum[1];

const poket = new Array(n).fill(0);

for(let w=1; w<=m; w++){
    const arr = input[w].split(' ').map(Number);
    let i = arr[0];//시작
    let j = arr[1];//끝
    let k = arr[2];//공번호
    
    for(let a=i; a<=j; a++){
        poket[a-1] = k;
    }
}


for(let i of poket){
    console.log(i);
}