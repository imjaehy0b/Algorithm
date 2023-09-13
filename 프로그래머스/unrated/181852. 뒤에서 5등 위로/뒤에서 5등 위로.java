import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        Arrays.sort(num_list);
        int idx = 0;
        for(int i=0; i<num_list.length;i++){
            if(i>=5){
                answer[idx++] = num_list[i];
            }
        }
        return answer;
    }
}