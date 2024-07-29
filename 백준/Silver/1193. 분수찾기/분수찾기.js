const fs = require('fs');
const x = +fs.readFileSync('/dev/stdin').toString().trim()

let n = 1,limit = 1;

//홀 = 분자 : n -> 1 , 분모 : 1 -> n
//짝 = 분자 : 1 -> n , 분모 : n -> 1 

while(limit < x){
    limit += n + 1;
    n++;

}


const a = n - (limit - x);


if(n%2===0){
    console.log(`${a}/${n-a+1}`);
}else{
    console.log(`${n-a+1}/${a}`);
}