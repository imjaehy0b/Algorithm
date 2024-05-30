function solution(s) {
    let answer = '';
    const arr = s.split(' ').sort((a,b)=>a-b);
    
    answer = arr.at(0)+' '+arr.at(-1);
    return answer;
}