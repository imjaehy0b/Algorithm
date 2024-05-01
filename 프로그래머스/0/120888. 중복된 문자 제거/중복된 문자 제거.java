class Solution {
    public String solution(String my_string) {
        String answer = "";
        //0,1,2,3,4...
        //i의 자리 인덱스값과 indexOf의 자리 인덱스값이 일치한다면 중복값이 없는것
        //why?-> indexOf는 마지막인덱스를 출력하기때문.
        for(int i=0; i<my_string.length(); i++){
            if(i==my_string.indexOf(String.valueOf(my_string.charAt(i)))){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}