class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        
       for(int i = 0; i<myString.length(); i++){
            String subStr = myString.substring(i, myString.length());
            if(subStr.startsWith(pat)){
                answer++;
            }
        }
        
        return answer;
    }
}