class Solution {
    public int solution(int n) {
        boolean val = (0<n&&n<=1000);
        int answer = 0;
        if(!val) return -1;
        
        for(int i=0; i<=n; i++){
            if(i%2==0) answer+=i;
        }
        
        return answer;
    }
}