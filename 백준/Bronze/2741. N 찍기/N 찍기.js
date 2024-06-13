const input = require('fs').readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);
const N = input[0];
const numbers = [];

for (let i = 1; i <= N; i++) {
    numbers.push(i);
}

console.log(numbers.join('\n'));