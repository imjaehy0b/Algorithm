function solution(n) {
    let answer = 2;
    let val = Math.sqrt(n);
    if(val%1 === 0){
        answer = 1
    }
    
    
    
    return answer;
}