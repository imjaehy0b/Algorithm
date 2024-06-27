const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');


let arr = {};


for(let i=0; i<input.length; i++){
    for(let j=0; j< input[i].length; j++){
        if(arr[j] === undefined){
            arr[j] = '';    
        }
        arr[j] += input[i][j];
    }
}

let newArr =[];
for (var key in arr) {
    if(arr[key]){
        newArr.push(arr[key]);
    }
}

console.log(newArr.join(''))