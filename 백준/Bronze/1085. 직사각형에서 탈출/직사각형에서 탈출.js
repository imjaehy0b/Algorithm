const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);

let x = input[0], y = input[1];
let w = input[2], h = input[3];

//경계선까지의 거리의 최소값은 x,y, |x-w|, |y-h| 중에 하나.

let val = [x,y,Math.abs(x-w),Math.abs(y-h)]

let min = Math.min(...val);


console.log(min)