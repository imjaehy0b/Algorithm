const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

let arr = Array.from({length:20},(_,index)=>index+1);

for(let i=0; i<input.length; i++){
    const [start, end] = input[i].split(' ');    
    let sliceRange = arr.slice(start-1, end);
    let reversArr = [];
    for(let a of sliceRange){
        reversArr.unshift(a);
    }
    arr = [...arr.slice(0, start-1), ...reversArr, ...arr.slice(end)];
    
}

console.log(arr.join(' '))