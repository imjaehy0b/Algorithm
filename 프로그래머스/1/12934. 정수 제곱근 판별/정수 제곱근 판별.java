class Solution {
    public long solution(long n) {
        long answer = -1;
        long x = (long)Math.sqrt(n);
        long powNum = (long)Math.pow(x,2);
        if(n==powNum){
            x+=1;
            answer = (long)Math.pow(x,2);
        }
        return answer;
    }
}