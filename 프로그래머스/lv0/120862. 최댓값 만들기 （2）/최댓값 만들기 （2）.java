import java.util.*;
class Solution {
    public int solution(int[] num) {
        int answer = 0;
        // int max = 0;
        //이 부분에서 -n * n 의 경우를 생각하지 못했음.
        //질문에서 힌트를보고 초기화 값을 음수로  시작함.
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
