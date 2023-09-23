import java.math.*;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger one = new BigInteger(a);
        BigInteger two = new BigInteger(b);
        answer =(one.add(two)).toString();
        return answer;
    }
}