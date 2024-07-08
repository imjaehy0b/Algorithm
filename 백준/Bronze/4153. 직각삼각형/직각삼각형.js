const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

for(let i=0; i<input.length; i++){
    let angle = input[i].split(' ').map(Number);
    
    let c = Math.max(...angle);
    let arr = angle.sort((a,b)=>a-b);
    
    let a = arr[0];
    let b = arr[1];


    let length = Math.pow(a,2) + Math.pow(b,2);
    
    if(length === 0){
        return;
    }
    
    if(Math.pow(c,2) === length){
        console.log("right")
    }else{
        console.log("wrong")
    }
    
}