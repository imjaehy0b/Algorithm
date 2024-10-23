import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();
        for(int a : arr){
            list.add(a);
        }
        
        for(int i=0; i<query.length; i++){
            if(i%2==0){//짝
                //query[i] 번 인덱스 뒷부분을 제거
                for (int j = list.size() - 1; j > query[i]; j--) {
                    list.remove(j);
                }
            }else{//홀
                //query[i] 번 인덱스 앞부분을 제거
                for (int j = 0; j < query[i]; j++) {
                    list.remove(0); // 앞에서부터 제거
                }
            }
        }
        int[] answer = new int[list.size()];
        int idx = 0;
        for(int i : list){
            answer[idx++] = i; 
        }
        
        return answer;
    }
}