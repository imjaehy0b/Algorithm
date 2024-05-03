class Solution {
    public Long[] solution(long n) {
        String str = String.valueOf(n);
        Long[] answer = new Long[str.length()];
        int i=0;
        while(n>0){
            answer[i] = n%10;
            n/=10;
            i++;
        }
        return answer;
    }
}