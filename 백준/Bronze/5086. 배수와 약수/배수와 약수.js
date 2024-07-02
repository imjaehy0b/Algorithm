const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

for(let i=0; i<input.length; i++){
    let [one, two] = input[i].split(' ').map(Number);

    if (one === 0 && two === 0) {
        break;
    }

    console.log(divAndMultCheck(one, two));
}


function divAndMultCheck(one, two){
    //one이 더 작을경우 약수 검사
    //two가 더 작을경우 배수 검사
    if (one < two) {
        if (two % one === 0) {
            return 'factor';
        }
    } else {
        if (one % two === 0) {
            return 'multiple';
        }
    }
    return 'neither';
}

