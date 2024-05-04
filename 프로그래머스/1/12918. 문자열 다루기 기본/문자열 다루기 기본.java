class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        //문자열의 길이가 4or6인지 체크 아니라면 false
        //4or6이라면 문자열이 숫자인지 체크 아니라면 false
        //둘다 맞다면 true
        //char[] 로 나누고 길이체크 후
        //char[i] 값이48~57인지 체크
        char[] ch = s.toCharArray();
        if(ch.length==4 || ch.length==6){
            for(int i=0; i<ch.length; i++){
                if(48<=ch[i]&&ch[i]<=57){
                    answer = true;
                }else{
                    answer = false;
                    break;
                }
            }
        }else{
            answer = false;
        }
        return answer;
    }
}