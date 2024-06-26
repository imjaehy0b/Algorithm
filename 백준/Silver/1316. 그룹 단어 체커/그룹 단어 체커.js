const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
const testCase = +input[0];
let cnt = 0;

for (let i = 1; i <= testCase; i++) {
  const word = input[i];
  const letter = [];
  let isGroupWord = true;

  for (let j = 0; j < word.length; j++) {
      //배열에 값이 없다면
    if (letter.indexOf(word[j]) === -1) {
      letter.push(word[j]); //값 입력
    } else {//값이 존재할경우
      if (letter.indexOf(word[j]) !== letter.length - 1) {  
          //입력된 letter의 마지막 값과 현재 체크하는 값이 일치하지않는다면
          //이전에 입력한 값이라는 뜻.
        isGroupWord = false;
        break;
      }
    }
  }

  if (isGroupWord) {
    cnt += 1;
  }
  
}

console.log(cnt)