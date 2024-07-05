const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

for(let i=1; i<=input[0]; i++){
    const hwn = input[i].split(' ');
    let h = +hwn[0]; //호텔 층수
    let w = +hwn[1]; //각층 방수
    let n = +hwn[2]; //몇번째 손님인지
    let room = 0;


    let floor = n % h;
    let room_number = Math.ceil(n / h);
    
    if (floor === 0) {
        floor = h;
    }

    console.log(floor*100 + room_number);
}
