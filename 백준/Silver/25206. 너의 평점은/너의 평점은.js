//전공평점 = 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값

const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

let majorSum = 0;
let creditsSum = 0;
for(let i=0; i<input.length; i++){
    let score = input[i].trim().split(' ');
    let subject = score[0]; //전공 과목
    let credits = parseFloat(score[1]); // 학점
    let rating = ratingSwap(score[2]); // 과목평점
    
    if (rating !== 'Pass') {
        majorSum += (credits * rating);
        creditsSum += credits;
    }
}

let majorRating = majorSum/creditsSum;

console.log(majorRating.toFixed(6));

function ratingSwap(rating){
    
    switch(rating){
        case 'A+':
            return 4.5;
        case 'A0':
            return 4.0; 
        case 'B+':
            return 3.5;
        case 'B0':
            return 3.0;
        case 'C+':
            return 2.5;    
        case 'C0':
            return 2.0;                
        case 'D+':
            return 1.5;                
        case 'D0':
            return 1.0;    
        case 'F':
            return 0.0;
        case 'P': 
            return 'Pass';
    }
}