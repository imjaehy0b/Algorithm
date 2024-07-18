const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const testCase = +input[0];
let square = Array.from(Array(100), ()=>Array(100).fill(0));

let answer = 0;
for(let i=1 ; i<=testCase; i++){
    let temp = input[i].split(' ');
    let x = +temp[0];
    let y = +temp[1];
    

    for(let j=x; j < x+10; j++){
        for(let k=y; k < y+10; k++){
			if (++square[j][k] == 1)
				answer++;
			}
    }
}

console.log(answer)