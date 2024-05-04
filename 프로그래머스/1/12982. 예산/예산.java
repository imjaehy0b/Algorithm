import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        //부서벌 신청금액 d
        //예산 budget
        //예산크기순으로 정렬 후 합계가 예산보다 크거나같을때까지 더한 횟수
        Arrays.sort(d);
        int sum=0;
        for(int i=0; i<d.length; i++){
            if(sum+d[i]<=budget){
                sum+=d[i];
                answer++;
            }
        }
        
        return answer;
    }
}