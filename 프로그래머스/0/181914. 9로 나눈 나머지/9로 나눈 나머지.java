class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        for(int i=0; i<number.length();i++){
            String a = String.valueOf(number.charAt(i));
            sum += Integer.parseInt(a);
        }
        answer = sum%9;
        return answer;
    }
}