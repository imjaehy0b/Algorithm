class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int add = 1;
        int pow = 0;
        for(int i : num_list){
            add *= i;
            pow += i;
        }
        if(add<Math.pow(pow,2))
            return 1;
        return answer;
    }
}