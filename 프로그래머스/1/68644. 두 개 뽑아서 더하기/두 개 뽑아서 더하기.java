import java.util.*;

class Solution {
    public Set<Integer> solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> set = new TreeSet<Integer>();
        int n = 0;
        for(int i=0; i<numbers.length;i++){
            for(int j=1+i; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        
        return set;
    }
}