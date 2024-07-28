const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split(' ');

const n = +input[0];
const k = +input[1];

let N = 1;
let K = 1;
let NK = 1;
for(let i=1; i<=n; i++){
    N *= i;
}
for(let i=1; i<=k; i++){
    K *= i;
}
for(let i=1; i<=n-k; i++){
    NK *= i;
}

console.log(N/(K*(NK)));
