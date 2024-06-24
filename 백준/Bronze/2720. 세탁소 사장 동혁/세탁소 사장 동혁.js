const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n').map(Number);

const caseNum = input[0];




//거스름돈은 항상 $5.00 이하이고, 손님이 받는 동전의 개수를 최소로 하려고 한다.

for(let i=1; i<input.length; i++){
    change(input[i]);
    
}

function change(money){
    const coins = [25, 10, 5, 1]; //동전의 값을 센트와 맞춤
    const count = [];

    for (const coin of coins) {
        count.push(Math.floor(money / coin));
        money %= coin;
    }
    console.log(count.join(' '))
}

