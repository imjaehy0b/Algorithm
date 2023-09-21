class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] sArray = my_string.split("");
        
        for(int i : indices){
            sArray[i] = "";
        }
        for(String s : sArray){
            sb.append(s);
        }
        answer = sb.toString();
        return answer;
    }
}