class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        
        //indexOf = 매개변수로 입력받은 문자가 없다면 -1을 반환 
        //문자가 존재한다면 문자의 시작인덱스 반환
        if(my_string.contains(target)){
            answer = 1;
        }
        return answer;
    }
}