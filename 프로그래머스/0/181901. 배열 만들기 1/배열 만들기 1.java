import java.util.*;
class Solution {
    public int[] solution(int n, int k) {
        int[] answer;
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=1; i<=n; i++){
            if(i%k==0){
                arr.add(i);        
            }
        }
        answer = new int[arr.size()];
        for(int j=0; j<answer.length;j++){
            answer[j] = arr.get(j);
        }
        return answer;
    }
}