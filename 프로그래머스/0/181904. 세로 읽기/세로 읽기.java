class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        //각 m개의 열에는 m번째마다 그 idx에 해당하는 값이 들어감
        for(int i=c-1; i<my_string.length(); i+=m){
            answer += my_string.charAt(i);
        }
        return answer;
    }
}