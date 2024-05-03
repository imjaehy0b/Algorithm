class Solution {
    public String swap(String s){
        int a = s.length();
        String word;
        if ( a % 2 == 0 ){
            word = s.substring(a/2 - 1, (a/2) + 1); 
        }else{
            word = s.substring((a/2), (a/2) + 1);
        }
        return word;
    }
    
    public String solution(String s) {
        String answer = swap(s);
        return answer;
    }
}