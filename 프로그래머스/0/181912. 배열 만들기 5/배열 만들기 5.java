import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<intStrs.length;i++){
            int strNum = Integer.parseInt(intStrs[i].substring(s,s+l));
            if(strNum>k){
                list.add(strNum);
            }
        }
        answer = new int[list.size()];
        for(int i=0; i<answer.length;i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}