import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        List<Integer> rank = new ArrayList<>();
        for(int[] i : score){
            rank.add(i[0]+i[1]);
        }
        rank.sort(Comparator.reverseOrder());
        
        
        int[] answer = new int[score.length];
        int idx = 0;
        for(int i=0; i<score.length; i++){
            idx = rank.indexOf(score[i][0] + score[i][1]);
            answer[i] = idx+1;
        }
        return answer;
    }
}