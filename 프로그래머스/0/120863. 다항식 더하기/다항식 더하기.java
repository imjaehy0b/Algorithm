import java.util.*;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" ");
        int n = 0;
        int x = 0;
        for(String s : arr){
            if(s.contains("x")){
                if(s.equals("x")){
                    x++;
                }else{
                    x+= Integer.parseInt(s.substring(0, s.length() - 1));
                }
            }else if(!s.equals("+")){
                n += Integer.parseInt(s);
            }
        }
        
    if(x == 1 && n == 0){
            answer = "x";
        }else if(x == 1 && n != 0){
            answer = "x + " + n;
        }else if(x != 0 && n == 0){
            answer = x + "x";
        }else if(x != 0 && n != 0){
            answer = x + "x + " + n;
        }else if(x == 0 && n != 0){
            answer = n+"";
        }

  
        return answer;
    }
}