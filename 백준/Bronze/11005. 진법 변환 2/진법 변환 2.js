let [num, form] = require('fs').readFileSync(0).toString().trim().split(" ").map((item) => Number(item));

let res = num.toString(form).toUpperCase();

console.log(res);