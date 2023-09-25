import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0){
                list.add(numlist[i]);
            }
        }
        int idx=0;
        int[] answer = new int[list.size()];
        for(int i : list){
            answer[idx++] = i;
        }
        return answer;
    }
}