const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split(' ');

let copy = [];

for(let i of input){
    copy.push(i);
}

let ascen = [], decen = [];
copy.sort((a,b)=>a-b);
for(let i of copy){
    ascen.push(i);
}

copy.sort((a,b)=>b-a);
for(let i of copy){
    decen.push(i);
}

if(input.join('')===ascen.join('')){
    console.log('ascending');
}else if(input.join('')===decen.join('')){
    console.log('descending');
}else{
    console.log('mixed');
}