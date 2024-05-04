class Solution {
    public String solution(String s) {
        String answer = "";
        //공백단위로 자르고 각 배열의 값중 짝수번째는 대문자, 홀수는 소문자로 변경후 
        //문자열을 합친다.
        String str = s;
        int idx =0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' '){
                answer += " ";
                idx = 0;
                continue;
            }
            if(idx%2==0){
                answer += Character.toUpperCase(str.charAt(i));
                idx++;
            }else{
                answer += Character.toLowerCase(str.charAt(i));                    
                idx++;
            }
        }
        
        return answer;
    }
}