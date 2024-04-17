import java.util.*;
class Solution {
    public int solution(String[] order) {
        int answer = 0;
        HashMap<String,Integer> menu = new HashMap<>();
        menu.put("americano",4500);
        menu.put("cafelatte",5000);
        menu.put("anything",4500);
        
        for(int i=0; i<order.length; i++){
            if(order[i].contains("americano")){
                answer += menu.get("americano");
            }else if(order[i].contains("cafelatte")){
                answer += menu.get("cafelatte");
            }else{
                answer += menu.get("anything");
            }
        }
        
        return answer;
    }
}