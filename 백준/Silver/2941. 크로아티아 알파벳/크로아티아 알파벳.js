const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

let arr = input.split(/(c=|c-|dz=|d-|lj|nj|s=|z=|.)/).filter(Boolean);

console.log(arr.length)

