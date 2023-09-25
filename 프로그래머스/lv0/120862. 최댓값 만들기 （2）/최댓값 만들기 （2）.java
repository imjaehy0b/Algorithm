import java.util.*;
class Solution {
    public int solution(int[] num) {
        int answer = 0;
        int max = Integer.MAX_VALUE * -1;
        
        for(int i=0;i<num.length;i++){
            for(int j=i+1; j<num.length; j++){
                int multi = num[i]*num[j];
                if(max < multi){
                    max = multi;
                }
            }
        }

        return max;
    }
}