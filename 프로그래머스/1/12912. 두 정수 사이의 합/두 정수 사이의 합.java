class Solution {
    public long solution(int a, int b) {
        long answer = sum(Math.min(a,b),Math.max(a,b));
        
        return answer;
    }
    
    public long sum(long a,long b){
        return (b - a + 1) * (a + b) / 2;
    }
}