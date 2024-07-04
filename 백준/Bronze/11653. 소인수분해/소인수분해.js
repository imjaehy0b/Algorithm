//조건 N (1 ≤ N ≤ 10,000,000) -> n^2으로 풀지 말아라.

//N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.


const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();


let div = input;
let prime = 2;
let arr = [];

while(div>1){
    
    if(div%prime === 0){
        div = div/prime;
        arr.push(prime);
    }else{
        prime++;
    }
}
console.log(arr.join('\n'))


