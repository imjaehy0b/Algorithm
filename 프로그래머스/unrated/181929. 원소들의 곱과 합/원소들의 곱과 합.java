class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int sum = 0;
        //모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return
        for(int i=0; i<num_list.length;i++){
            answer = num_list[i]*answer;
            sum += num_list[i];
        }
        if(answer<sum*sum){
            return 1;
        }
        return 0;
    }
}