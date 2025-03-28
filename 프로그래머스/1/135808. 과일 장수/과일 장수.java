import java.util.*;
import java.util.stream.*;


class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        int[][] box = new int[score.length / m][m];
        score = IntStream.of(score)
                   .boxed()
                   .sorted(Collections.reverseOrder())
                   .mapToInt(Integer::intValue)
                   .toArray(); 
        
        for(int i=1; i<=score.length; i++){            
            
            if(i%m==0 && i!=0){
                answer += score[i-1] * m;
            }
     
        }

        return answer;
    }
}
