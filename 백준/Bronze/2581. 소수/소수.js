const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const start = +input[0];
const end = +input[1];


//start~end 중 소수를 찾고 소수의 합을 구한뒤 소수중 최소값을 찾아라.
let primeNum = [];
for(let i = start; i <= end; i++){
    if(i < 2) continue;
    
    let isPrime = true
    for (let j = 2; j <= Math.sqrt(i); j++) {
        if (i !== j && i % j === 0) {
            isPrime = false;
            break;
        }
    }

    if(isPrime){
        primeNum.push(i);
    }
    
}

if (primeNum.length === 0) {
    console.log(-1);
} else {
    let sum = primeNum.reduce((p, n) => p + n, 0);
    let min = Math.min(...primeNum);

    console.log(sum);
    console.log(min);
}