import java.util.*;

class Solution {
    public int[] solution(int n) {
        HashSet<Integer> arr = new HashSet<>();        
        
        int target = n;
        int i=2;
        while(target > 1){
            if(target%i == 0){
                target/=i;
                arr.add(i);
            }else{
                i++;
            }
        }
        
        int[] answer = 
            arr
            .stream()
            .sorted()
            .mapToInt(Integer::intValue)
            .toArray();

        return answer;
    }
}