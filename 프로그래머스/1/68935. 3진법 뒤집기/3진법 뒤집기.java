import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        String three = Integer.toString(n,3);
        char[] ch = three.toCharArray();
        String str ="";
        for(int i=0; i<ch.length;i++){
            str += ch[ch.length-1-i];
        }
        answer = Integer.parseInt(str,3);
        
        return answer;
    }
}