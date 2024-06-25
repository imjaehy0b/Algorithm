const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

let square = 1;
for(let i=1; i<= +input; i++){
    square *= 2;
}

square += 1;

console.log(square*square)