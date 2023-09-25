import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        //n값을 string으로 변환 후 쪼개서 string배열에 담고 sort를 이용해 정렬
        //정렬한 값을 string에 넣고 long타입으로 전환
        StringBuilder sb = new StringBuilder();
        sb.append(n);

        String[] sArr = sb.toString().split("");
        Arrays.sort(sArr,Collections.reverseOrder());
        sb.setLength(0);
        for(String s : sArr){
            sb.append(s);
        }
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}