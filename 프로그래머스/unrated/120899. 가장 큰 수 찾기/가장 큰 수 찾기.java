import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        //가장 큰 수와 그 수의 인덱스를 담은 배열
        int[] answer = new int[2];

        int max = 0;
        int idx = 0;
        for(int i=0; i<array.length; i++){
            if(max<array[i]){
                max = array[i];
                idx = i;
            }
        }
        answer[0] = max;
        answer[1] = idx; 
        
        return answer;
    }
}