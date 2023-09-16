import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        long x = (long)Math.sqrt(n);
        long y = (long)Math.pow(x,2);
        
        if(n==y){
            x += 1;
            answer = (long)Math.pow(x,2);
        }else{
            answer = -1;
        }
        return answer;
    }
}