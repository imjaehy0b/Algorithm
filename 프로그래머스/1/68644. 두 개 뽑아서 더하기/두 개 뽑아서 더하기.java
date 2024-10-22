import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<Integer>();
        int n = 0;
        for(int i=0; i<numbers.length;i++){
            for(int j=1+i; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        int[] answer = new int[set.size()];
        int idx = 0;
        
        for(Integer i : set){
            answer[idx++] = i;
        }
        return answer;
    }
}