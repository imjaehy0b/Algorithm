const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n').reduce((acc,cur)=>acc*cur);

console.log(input)


