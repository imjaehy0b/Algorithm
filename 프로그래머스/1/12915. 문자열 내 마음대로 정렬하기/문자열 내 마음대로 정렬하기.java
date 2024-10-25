import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        int idx = 0;
        List<String> list = new ArrayList<>();
        
        for(String str : strings){
            list.add(String.valueOf(str.charAt(n)) + str);
        }
        Collections.sort(list);
        
        for(String s : list){
            answer[idx++] = s.substring(1,s.length());
        }            
        
        return answer;
    }
}