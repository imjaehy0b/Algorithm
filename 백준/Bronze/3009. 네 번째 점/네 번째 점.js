const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

let X = [];
let Y = [];
for(let i=0; i<input.length; i++){
    let coor = input[i].split(' ').map(Number);
    let x = coor[0], y = coor[1];
    
    if(!X.includes(x)){
        X.push(x);
    }else{
        let xIdx = X.indexOf(x);
        if (xIdx !== -1) {
            X.splice(xIdx, 1);
        }
    }
    if(!Y.includes(y)){
        Y.push(y);
    }else{
        let yIdx = Y.indexOf(y);
        if (yIdx !== -1) {
            Y.splice(yIdx, 1);
        }
    }
}
let res = [];
res.push(...X);
res.push(...Y);
console.log(...res)