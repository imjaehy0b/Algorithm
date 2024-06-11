const fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().trim().split(' ');

let a = +input[0];
let b = +input[1];
let c = +input[2];
let result;
if(a===b && b===c){
    result = 10000+(a)*1000;
}else if(a===b || b===c || a===c){
    let num;
    if(b!==c){
        num = a;
    }else{
        num = c;
    }
    result = 1000+num*100;
}else{
    result = Math.max(a,b,c)*100;
}
console.log(result);