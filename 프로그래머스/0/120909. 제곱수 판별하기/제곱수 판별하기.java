import java.lang.*;

class Solution {
    public int solution(int n) {
        int answer = 2;
        double sqrt = Math.sqrt(n);
        //제곱수의 경우 1로 나누어 떨어진다.
        if(sqrt%1==0) answer =1;
        
        
        return answer;
    }
}