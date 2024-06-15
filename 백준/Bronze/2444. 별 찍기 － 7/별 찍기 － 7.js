const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

let line = 2*input-1;//9

let a = Math.floor(line/2);
let num = input;//5

for(let i=1; i<=a; i++){
    let res = [];
    for(let j=1; j<=num-i; j++){ //4,3,2,1 공백이 점점 줄어야함.
        res.push(' ');
    }
    for(let j=0; j<=2*(i-1); j++){//1,3,5,7 
        res.push('*');
    }
    console.log(res.join(''));
}

let res = '*'.repeat(line);
console.log(res);

for(let k = 1; k <= a; k++){
    let res = [];
    for(let j = 1; j <= k; j++){ //1,2,3,4 공백이 점점 늘어야함
        res.push(' ');
    }
    for(let j=0; j <= 2*(a-k); j++){//7,5,3,1 별이 점점 줄어야함
        res.push('*');
    }
    console.log(res.join(''));
}