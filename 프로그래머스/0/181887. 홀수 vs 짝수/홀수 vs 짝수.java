class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int odd = 0;
        int even = 0;
        //홀수 번째 합 짝수 번째 합 비교 후 큰거 리턴
        for(int i=0; i<num_list.length; i++){
            if(i%2==0){
                odd += num_list[i];
            }else{
                even += num_list[i];
            }
        }
        answer = odd>even ? odd : even;
        return answer;
    }
}