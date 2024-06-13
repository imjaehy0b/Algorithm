const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();
const conditionNum = +input;
let n = 1n;

if (conditionNum === 0) {
    console.log(1n.toString());
} else {
    for (let i = 1; i <= conditionNum; i++) {
        n *= BigInt(i); 
    }
    console.log(n.toString()); 
}