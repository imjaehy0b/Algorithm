//첫째 줄에 행렬의 크기 N 과 M이 주어진다.
//둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다.
//이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다.
//N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.

const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const conditionNum = input[0].split(' ');

let n = +conditionNum[0];//3
let m = +conditionNum[1];//3

const arr = []

for(let i=1; i<=n; i++){
    const arr1 = input[i].split(' ').map(Number);
    const arr2 = input[i+n].split(' ').map(Number);
    
    const result = arr1.map((x,y) => x+arr2[y]);
    

    console.log(...result)

}
