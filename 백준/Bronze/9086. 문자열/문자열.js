const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const inputLine = +input[0]; //3

//입력받은 문자열의 idx= 0 + length-1 을 출력
//문자열의 길이가 1이라면 0을 두번.
const str = [];

for(let i =1; i<=inputLine; i++){
    if(input[i].length==1){
        str.push(input[i]+input[i])
        continue;
    }
    let arr = input[i].split('');
    str.push(arr[0]+arr[arr.length-1])
}


console.log(str.join('\n'));