import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        int min = 0;
        int max = Integer.MAX_VALUE;
        //array값중 n과 가장 가까운 수.
        for(int i=0; i<array.length; i++){
            min = n-array[i];
            if(min<0){
                min = array[i] - n;
            }
            if(min==0){
                answer = array[i];
                break;
            }
            System.out.println(min);
            if(min<max){
                answer = array[i];
                max = min;
            }

        }
        return answer;
    }
}