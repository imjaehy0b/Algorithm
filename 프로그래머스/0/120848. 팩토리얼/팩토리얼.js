function solution(n) {
    var answer = 1;
    let i = 1;
    while(true){
        answer *= i;
        if(answer===n){
            return i;
        }
        if(answer > n){
            --i;
            return i;
        }
        i++;
        
    }

}