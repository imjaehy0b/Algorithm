class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        while(chicken >= 10) {
            int newChicken = chicken / 10;   // 쿠폰으로 받을 수 있는 치킨 수
            int coupons = chicken % 10;      // 남은 쿠폰 수
            
            answer += newChicken;            // 서비스 치킨 추가
            chicken = newChicken + coupons;  // 새로 받은 치킨으로 발생한 쿠폰 + 이전에 남은 쿠폰
        }
        
        return answer;
    }
}