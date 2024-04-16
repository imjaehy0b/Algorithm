class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int len = num_list.length;
        //길이 11이상 모든합, 10이하 모든곱
        if(len>=11){
            for(int num : num_list) answer += num;
        }else{
            answer =1;
            for(int num : num_list) answer *= num;
        }
        return answer;
    }
}