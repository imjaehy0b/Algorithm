const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().toUpperCase().split('').sort();


const char = Array.from(new Set(input));
let cnt = 0;
const cntArr = [];
for(let i=0; i<char.length; i++){
    let c = char[i];
    
    for(let j=0; j<input.length; j++){
        if(input[j]===c){
            cnt++;
        }
    }
    cntArr.push(cnt);
    cnt = 0;
}
let max = Math.max(...cntArr);

if(cntArr.indexOf(max)===cntArr.lastIndexOf(max)){
    console.log(char[cntArr.indexOf(max)]);
}else{
    console.log('?');
}