const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');


for(let i=0; i<input.length; i++){
    if(+input[i]===-1){
        return;
    }
    perfectCheck(+input[i]);
}



function perfectCheck(num){
    let arr = [];
    for(let i=1; i<num; i++){
        if(num%i===0){
            arr.push(i);
        }
    }
    
    let sum = arr.reduce((accumulator, currentValue) => {
        return accumulator + currentValue;
    }, 0);
    
    if(sum === num){
        console.log(`${num} = ${arr.join(' + ')}`);
    }else{
        console.log(`${num} is NOT perfect.`);
    }
}