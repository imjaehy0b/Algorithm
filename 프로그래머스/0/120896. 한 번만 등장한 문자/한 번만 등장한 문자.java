import java.util.*;
class Solution {
    public String solution(String s) {
        String str = "";
        for(int i=0; i<s.length(); i++){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                str += s.charAt(i);
            }
        }
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String answer = new String(charArray);
        return answer;
    }
}