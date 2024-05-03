class Solution {
    public int[] solution(long n) {
        char[] ch = String.valueOf(n).toCharArray(); 
        int[] answer = new int[ch.length];
        for(int i=0; i<ch.length;i++){
            answer[i] = Integer.parseInt(String.valueOf(ch[ch.length-1-i]));
        }
        return answer;
    }
}