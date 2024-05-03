import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p =0,y = 0;
        //소문자로변경->문자정렬 -> p와y의 숫자 카운트후 비교
        String[] str = s.toLowerCase().split("");
        Arrays.sort(str);
        for(int i=0; i<str.length;i++){
            if(str[i].equals("p")){
                p++;
            }else if(str[i].equals("y")){
                y++;
            }
        }
        if(p==y){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}