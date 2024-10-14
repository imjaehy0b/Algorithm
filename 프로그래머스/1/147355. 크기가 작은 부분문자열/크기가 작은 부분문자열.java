import java.util.*;

class Solution {
    public int solution(String t, String p) {
        List<Long> arr = new ArrayList<>();
        int answer = 0;
        Long num = Long.parseLong(p);
        
        for(int i = 0; i <= t.length() - p.length(); i++){
            arr.add(Long.parseLong(t.substring(i, i + p.length())));
        }

        for(Long i : arr){
            if(num >= i){
                answer++;
            }
        }
        
        return answer;
    }
}