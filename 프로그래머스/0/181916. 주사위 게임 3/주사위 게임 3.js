function solution(a, b, c, d) {
    //주사위 일치 갯수
    //1. 4 = 1111 * p
    //2. 3,1 = (10*p+q)^2
    //3. 2,2 = p+q * |p-q|
    //4. 2,1,1 = q * r
    //5. 1,1,1,1 = min
    
    //중복 불가능한 자료구조는 -> set
    //set을 이용하면 입력된 값에 따라 중복체크가 가능할 거같음.
    //1번 케이스는 length가 1
    //2번 케이스는 length가 2
    //3번 케이스는 length가 2
        //2,3번 케이스는 어떻게 구분?
        //length가 2일때는 별로도 체크
        //length가 2라면 3개가 같으면 2번케이스 아니라면 3번케이스로 동작
    //4번 케이스는 length가 3
    //5번 케이스는 length가 4
    var answer = 0;
    const number = new Set([a,b,c,d]);
    const length = number.size;
    
    let values = [a, b, c, d];
    let frequency = {};
    values.forEach(value => {
        frequency[value] = (frequency[value] || 0) + 1;
    });
    let three = Object.values(frequency).some(count => count >= 3) === true ? true : false;
    let threeValues = Object.keys(frequency).filter(value => frequency[value] === 3).map(Number);
    let uniqueValues = Object.keys(frequency).filter(value => frequency[value] === 1).map(Number);
   
    let arr = []
    function logSetElements(value, set) {
        arr.push(value);
    }
    number.forEach(logSetElements);
    
    
    switch(length){
        case 1:
            answer = 1111*arr[0];
            break;
        case 2:
            //a,b,c,d 중 3개가 같거나 2,2씩 같을경우
            if(three){
                answer = Math.pow((10 * threeValues[0] + uniqueValues[0]),2);
            }else{
                answer = (arr[0]+arr[1])*Math.abs(arr[0]-arr[1]);
            }
            break;
        case 3:
            //a,b,c,d 중 2개가 같고 2개는 각각 다를경우.
            answer = uniqueValues[0]*uniqueValues[1];
            break;
        case 4:
            answer = Math.min(...arr);
            break;
        default:
            break;
    }
    return answer;
}