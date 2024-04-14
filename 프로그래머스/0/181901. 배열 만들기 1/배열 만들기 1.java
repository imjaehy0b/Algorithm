import java.util.*;
class Solution {
    public int[] solution(int n, int k) {
        int[] answer;
        ArrayList<Integer> arr = new ArrayList<>();
        
        //1이상 n이하의 정수, k의 배수를 오름차순
        for(int i=1; i<=n; i++){
            if(i%k==0){
                arr.add(i);        
            }
        }
        answer = new int[arr.size()];
        for(int j=0; j<answer.length;j++){
            answer[j] = arr.get(j);
        }
        Arrays.sort(answer);
        return answer;
    }
}