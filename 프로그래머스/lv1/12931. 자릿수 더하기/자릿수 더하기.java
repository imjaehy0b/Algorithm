import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String test = ""+n;
        for (int i = 0; i < test.length(); i++) {
           answer += test.charAt(i)-48;
        }
        

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}