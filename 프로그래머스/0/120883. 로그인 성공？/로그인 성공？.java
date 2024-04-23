import java.util.*;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        String id = id_pw[0];
        String pw = id_pw[1];

        for(String[] db2 : db){
            String db_id = db2[0];
            String db_pw = db2[1];
            if(db_id.equals(id)&&db_pw.equals(pw)){
                answer = "login";
            }else if(db_id.equals(id)&&!db_pw.equals(pw)){
                answer = "wrong pw";
                break;
            }else if(!db_id.equals(id)){
                answer = "fail";
            }
            
        }
        return answer;
    }
}