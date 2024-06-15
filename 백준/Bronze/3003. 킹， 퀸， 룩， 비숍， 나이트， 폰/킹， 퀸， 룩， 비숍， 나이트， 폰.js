//체스는 총 16개의 피스를 사용하며, 
//킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.

const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();


const chess = [1,1,2,2,2,8];
let arr = input.split(' '); 
// 2 1 2 1 2 1
// 1,1,2,2,2,8
// -1 0 0 1 0 7

const answer = [];
//같은값인지 확인 -> 다르면 값비교후 필요값이 더크면 ++ , 필요값이 더 작으면 --
for(let i=0; i<6; i++){
    if(arr[i]===chess[i]){
        answer.push(0);
    }
    
    let cnt = 0;
    if(arr[i]>chess[i]){
        while(arr[i]!=chess[i]){
            arr[i]--;
            cnt++;
        }
        answer.push(-cnt);
        cnt = 0;
    }else{
        while(arr[i]!=chess[i]){
            arr[i]++;
            cnt++;
        }
        answer.push(cnt);
        cnt = 0;
    }
}
console.log(...answer)
