const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n').map(Number);


console.log(angles(input));




function angles(data){
    let [a,b,c] = input;
    let sum = 0;
    let uniqueCnt = new Set(data);
    for(let i=0; i<data.length; i++){
        sum += data[i];
    }

    if(sum === 180){
        if(uniqueCnt.size === 1 && a===60){
            return 'Equilateral';   
        }
        if(uniqueCnt.size === 2){
            return 'Isosceles';
        }
        if(uniqueCnt.size === 3){
            return 'Scalene';
        }
    }else{
        return 'Error';
    }
    
}

