class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int big = 0;
        int small = 0;
        if(a>b){
            big = a;
            small = b;
        }else if(b>a){
            big = b;
            small = a;
        }else{
            answer = a;
        }
        
        for(int i=small; i<=big; i++){
            answer += i;
        }
        
        return answer;
    }
}