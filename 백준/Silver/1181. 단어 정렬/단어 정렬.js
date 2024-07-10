//길이가 짧은 것부터/
//길이가 같으면 사전 순으로
//단, 중복된 단어는 하나만 남기고 제거해야 한다.

const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

input.shift();

input.sort(function(a, b) {
  if (a.length > b.length) {
    return 1; 
  } else if (a.length < b.length) {
    return -1; 
  } else {
    if (a > b) {
      return 1; 
    } else if (a < b) {
      return -1;
    } else {
      return 0;
    }
  }
});


let newArr = [];

for(let i of input){
    if(!newArr.includes(i)){
        newArr.push(i);
    }
}
console.log(newArr.join('\n'))