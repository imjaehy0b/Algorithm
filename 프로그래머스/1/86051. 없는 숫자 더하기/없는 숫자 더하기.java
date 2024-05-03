import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        //반복문 돌면서 i값이 일치하는게 있는지 체크 후 없다면 +
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : numbers){
            list.add(num);
        }
        for(int i=0; i<=9;i++){
            if(!list.contains(i)) answer += i;
        }
        return answer;
    }
}