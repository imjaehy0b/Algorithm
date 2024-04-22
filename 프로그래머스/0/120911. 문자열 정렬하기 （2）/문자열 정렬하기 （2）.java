import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        String[] str = new String[answer.length()];
        for(int i=0; i<str.length; i++){
            str[i] = String.valueOf(answer.charAt(i));
        }
        Arrays.sort(str);
        answer = "";
        for(String s : str){
            answer += s;
        }
        return answer;
    }
}