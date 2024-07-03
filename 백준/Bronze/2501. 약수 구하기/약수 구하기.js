const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split(' ');

const arr = input.map(Number);
const div = [];

for(let i=1; i<=arr[0]; i++){
    if(arr[0]%i === 0){
        div.push(i);
    }
}

if(div.length < arr[1]){
    console.log(0);
}else{
    console.log(div[arr[1]-1]);
}