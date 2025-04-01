class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0;
        int idx2 = 0;
        
        for (String targetCard : goal) {
            // cards1 배열에서 매칭 확인
            if (idx1 < cards1.length && targetCard.equals(cards1[idx1])) {
                idx1++; 
            }
            // cards2 배열에서 매칭 확인
            else if (idx2 < cards2.length && targetCard.equals(cards2[idx2])) {
                idx2++; 
            }
            else {
                return "No";
            }
        }
            return "Yes";
    }
}