import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i=0;i<my_string.length();i++){
            String str = my_string.substring(i,my_string.length());
            arr.add(str);
        }
        arr.sort(Comparator.naturalOrder());
        for(int i=0; i<answer.length; i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}