const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n').map((item)=>item.split(' '));

let max = 0;
let col = 0;
let row = 0;

for(let i=0; i<input.length; i++){
let min =  Math.max(...input[i])
if(max < min){
    max = min;
    row = i;
}


}
col = input[row].map(Number).indexOf(max);
console.log(max);
console.log(row+1, col+1)