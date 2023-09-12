class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int x = my_string.length() - n;

        answer = my_string.substring(x);
        return answer;
    }
}