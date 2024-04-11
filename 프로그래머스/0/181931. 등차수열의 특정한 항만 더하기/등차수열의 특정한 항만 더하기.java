class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int add = a;
        for(int i=0; i<included.length;i++){
            if(included[i]){
                answer += add;
            }
            add += d;
        }
        return answer;
    }
}