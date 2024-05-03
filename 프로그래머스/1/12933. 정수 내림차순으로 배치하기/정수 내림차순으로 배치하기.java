import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] str = String.valueOf(n).split("");
        Arrays.sort(str);
        String s ="";
        for(int i=0; i<str.length;i++){
            s+=str[str.length-1-i];
        }
        answer = Long.parseLong(s);
        return answer;
    }
}