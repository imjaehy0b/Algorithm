
//조건은 10^9 즉 시간복잡도를 O(n) or O(logn) 으로 풀어야한다.
const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split(' ');

//A올라가는 길이  B 미끄러진 길이  V 높이
let up= +input[0], down= +input[1], end= +input[2];
//result = V가 될때까지 반복, A를 더하고 B를 빼는 행위를 반복? -> 시간초과 실패

let res = 0, cnt=0;


cnt = Math.ceil((end - down) / (up - down));


console.log(cnt); 