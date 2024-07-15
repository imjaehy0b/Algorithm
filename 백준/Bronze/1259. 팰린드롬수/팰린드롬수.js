const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

for(let i=0; i<input.length-1; i++){
    let arr = input[i].split('');
    let newArr = [];
    for(let j=0; j<arr.length; j++){
        newArr.push(arr[arr.length-j-1]);
    }
    if(arr.join('')===newArr.join('')){
        console.log('yes');
    }else{
        console.log('no');
    }
}