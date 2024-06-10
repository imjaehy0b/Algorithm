function solution(numer1, denom1, numer2, denom2) {
    var answer = [];

    const numer = numer1*denom2+denom1*numer2; // 10
    const denom = denom1*denom2; //8

    let minNum;
    if(numer > denom){
        minNum = denom;
    }else{
        minNum = numer;
    }

    while(true){
        if(numer%minNum===0&&denom%minNum===0){
            answer.push(numer/minNum);
            answer.push(denom/minNum);
            return answer;
        }
        minNum--;
    }

}