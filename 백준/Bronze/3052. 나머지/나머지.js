const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

//%42로 나머지를 구한뒤 새로운배열로 반환
//그다음 서로 다른 값이 몇 개 있는지 구해야한다.
//set은 중복값을 허용하지않기때문에 set으로 중복값을 걸러준다.

const arr = input.map((a,b)=>a%42)


const value = new Set(arr);


console.log(value.size)

