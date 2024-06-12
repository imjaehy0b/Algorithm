const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const conditionNum = input[0].split(' ').map(Number);
const n = conditionNum[0]; //바구니 번호
const m = conditionNum[1]; //길이.

const poket = [];
for(let i=1; i<=n; i++){
    poket[i-1] = i;
}



for(let k=1; k<=m; k++){
    let arr = input[k].split(' ').map(Number);
    let i = arr[0]-1;
    let j = arr[1]-1;
    temp = poket[i];
    poket[i] = poket[j];
    poket[j] = temp;
}

for(let i of poket){
    console.log(i);
}