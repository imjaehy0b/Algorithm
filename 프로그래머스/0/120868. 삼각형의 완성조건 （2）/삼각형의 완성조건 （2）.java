import java.util.*;

class Solution {
    public int solution(int[] sides) {
        //가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
        // a + b > c
        // a + c > b
        // b + c > a
        //두 변을 제공.

        int a = sides[0];
        int b = sides[1];
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=(max-min)+1; i<a+b; i++){
             list.add(i);
        }
        
        
        return list.size();
    }
}