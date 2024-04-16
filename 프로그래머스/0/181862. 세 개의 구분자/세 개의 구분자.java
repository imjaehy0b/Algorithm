import java.util.*;
class Solution {
    public ArrayList<String>  solution(String myStr) {
        String tmp = "";
        ArrayList<String> answer = new ArrayList<>();
        int count =0;
        for(char c : myStr.toCharArray()){
            if(c=='a'||c=='b'||c=='c'){
                if(tmp != ""){
                    answer.add(tmp);
                    tmp = "";
                }
            }else{
                tmp += c;
                count++;
            }
        }
        if(tmp != "") answer.add(tmp);
        if(answer.size()==0) answer.add("EMPTY");
        
        return answer;
    }
}