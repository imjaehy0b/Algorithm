class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        //가격, 가진돈, 타고싶은 횟수
        //sum = 가격 * 횟수
        //answer = sum - 가진돈
        
        for(int i=1; i<=count; i++){
            sum += price * i;
        }
        answer = sum - money;
        if(answer<0){
            return 0;
        }
        return answer;
    }
}