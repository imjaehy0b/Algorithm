import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        List<Integer> angleX = new ArrayList<>();
        List<Integer> angleY = new ArrayList<>();

        for(int[] i : dots){
            angleX.add(i[0]);
            angleY.add(i[1]);
        }
        angleX.sort(Comparator.reverseOrder());
        angleY.sort(Comparator.reverseOrder());
        
        int x = angleX.get(0)-angleX.get(angleX.size()-1);
        int y = angleY.get(0)-angleY.get(angleY.size()-1);
        
        int answer = x*y;
        return answer;
    }
}