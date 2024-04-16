import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0; i<strArr.length;i++){
            if(!strArr[i].contains("ad")){
                arr.add(strArr[i]);
            }
        }
        String[] answer = new String[arr.size()];
        for(int j=0; j<answer.length;j++){
            answer[j] = arr.get(j);
        }
        
        return answer;
    }
}