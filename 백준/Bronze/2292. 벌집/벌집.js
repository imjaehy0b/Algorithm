const fs = require('fs');
const input = +fs.readFileSync('/dev/stdin').toString().trim();


let honeycomb = 1;
let cnt = 1;

while(true){
    if(input<=honeycomb){
        break;
    }
    honeycomb = honeycomb + (cnt*6);
    cnt++;
}

console.log(cnt)