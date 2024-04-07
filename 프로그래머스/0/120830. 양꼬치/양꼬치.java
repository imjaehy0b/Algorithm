class Solution {
    public int solution(int n, int k) {
        //양꼬치 1 = 12,000 음료1 = 2000
        //양꼬치 n*12000, 음료 k*2000
        //n = 10 -> k-1
        int answer = n*12000 + (k-n/10)*2000;
        return answer;
    }
}