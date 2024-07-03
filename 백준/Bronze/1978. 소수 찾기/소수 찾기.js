const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const cnt = +input[0];
const testCase = input[1].split(' ');
let primeNum = 0;

for (let i = 0; i < cnt; i++) {
    const num = +testCase[i];
    if (num <= 1) {
        continue;
    }

    let isPrime = true;
    for (let j = 2; j < num; j++) {
        if (num % j === 0) {
            isPrime = false;
            break;
        }
    }

    if (isPrime) {
        primeNum++;
    }
}

console.log(primeNum);