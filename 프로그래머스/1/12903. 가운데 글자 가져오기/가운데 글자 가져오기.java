class Solution {
    public String solution(String s) {
        String answer = "";
        for(int i=0; i<s.length();i++){
            if(i+1==s.length()-1-i){
                answer += s.charAt(i);
                answer += s.charAt(s.length()-1-i);
                
                break;
            }else if(i==s.length()-1-i){
                answer += s.charAt(i);
                break;
            }
            
        }
        return answer;
    }
}