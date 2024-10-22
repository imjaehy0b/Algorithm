import java.util.*;

class Solution {
    public int solution(int[] sides) {
        //가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
        // a + b > c
        // a + c > b
        // b + c > a

        int max = Math.max(sides[0],sides[1]);
        int min = Math.min(sides[0],sides[1]);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=(max-min)+1; i<max+min; i++){
             list.add(i);
        }
        
        
        return list.size();
    }
}