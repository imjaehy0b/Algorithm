import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] bf = new String[before.length()];
        String[] af = new String[before.length()];
        
        for(int i=0; i<bf.length; i++){
            bf[i] = String.valueOf(before.charAt(i));
            af[i] = String.valueOf(after.charAt(i));
        }
        Arrays.sort(bf);
        Arrays.sort(af);
        before = "";
        after = "";
        for(int i=0; i<bf.length; i++){
            before += bf[i];
            after += af[i];
        }
        answer = before.equals(after) ? 1 : 0;
        return answer;
    }
}