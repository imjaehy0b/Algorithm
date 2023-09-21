class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        //문자열의 인덱스를 q로 나누었을떄의 나머지r인 문자를 앞에서부터 이어붙이기
        //문자열의 인덱스 i를 q로 나머지연산한 값이 r일경우 i번째 문자를 이어붙이기
        
        for(int i=0; i<code.length(); i++){
            if(i%q==r){
                sb.append(code.charAt(i));
            }
        }
        answer = sb.toString();
        return answer;
    }
}