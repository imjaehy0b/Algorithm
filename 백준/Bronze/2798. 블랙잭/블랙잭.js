const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const testCase = input[0].split(' ');

const n = +testCase[0]; //카드 수
const m = +testCase[1]; //목표 카드 값

const card = input[1].split(' ').map(Number);

let sum = 0;
let maxSum = 0;


for(let i=0; i<card.length-2; i++){
    for(let j=i+1; j<card.length-1; j++){
        for(let k=j+1; k<card.length; k++){
            sum = card[i]+card[j]+card[k];
            
            if(sum<= m && sum >maxSum){
                maxSum = sum;
            }
        }
    }
    
}


console.log(maxSum)