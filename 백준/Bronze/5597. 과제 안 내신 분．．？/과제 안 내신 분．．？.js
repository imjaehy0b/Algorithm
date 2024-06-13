const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n').map(Number);


const newArr = input.sort((a,b)=>a-b);

let student = [];
for(let i=1; i<=30; i++){
    if(newArr.indexOf(i)===-1){
        student.push(i);
    }
}

console.log(student[0]);
console.log(student[1]);

