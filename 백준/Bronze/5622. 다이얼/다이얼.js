const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('');

let map = new Map();
map.set("ABC",3);
map.set("DEF",4);
map.set("GHI",5);
map.set("JKL",6);
map.set("MNO",7);
map.set("PQRS",8);
map.set("TUV",9);
map.set("WXYZ",10);

let res = 0;
for(let i=0; i<input.length; i++){
    res += getValue(map, input[i])
}

console.log(res)

function getValue(map, char) {
    for (let [key, value] of map) {
        if (key.includes(char)) {
            return +value;
        }
    }
    return undefined;
}