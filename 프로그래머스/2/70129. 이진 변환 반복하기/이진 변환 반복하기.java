class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int total = 0;
        int change = 0;
        while(!s.equals("1")){
            int beforeLength = s.length();
            
            s = s.replaceAll("0", "");
            
            int afterLength = s.length();
            total += (beforeLength - afterLength);
            
            s = Integer.toBinaryString(afterLength);
            
            change++;
        }
        
        answer[0] = change;
        answer[1] = total;
        
        
        return answer;
    }
}