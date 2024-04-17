class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        //date1이 date2보다 앞서는 날짜라면 1을,
        if(date1[0]<date2[0]) return 1;
        
        if(date1[0]==date2[0]){
            if(date1[1]==date2[1]){
                return date1[2]<date2[2] ? 1 : 0;
            }
            
            if(date1[1]<date2[1]) {
                return 1;
            }
        }
        
        return answer;
    }
}