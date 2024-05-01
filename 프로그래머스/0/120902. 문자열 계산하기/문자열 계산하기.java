class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split(" ");
        String cal = "";
        answer = Integer.parseInt(str[0]);
        //숫자는 짝수, +,-는 홀수
        //0번째는 항상 숫자.
        for(int i=1; i<str.length; i++){
            if(i%2!=0){
                cal = str[i];
                continue;
            }
            if(cal.equals("+")){
                answer += Integer.parseInt(str[i]);
            }else{
                answer -= Integer.parseInt(str[i]);
            }
        }
        return answer;
    }
}