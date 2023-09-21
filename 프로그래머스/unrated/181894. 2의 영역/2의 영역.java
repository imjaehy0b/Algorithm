import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        //2로 시작해서 가장 마지막2로끝나는 범위를 구하는것
        //배열을 만든뒤 값이 2라면 해당 index값을 배열에 저장.
        //해당 배열의 0번째 값인 index부터 마지막 값의 index만큼의 길이를 arr에서 가져온다.
        for(int i=0; i<arr.length; i++){
            if(arr[i]==2){
                list.add(i);
            }
        }
        
        if (!list.isEmpty()) {
            int first = list.get(0);
            int last = list.get(list.size() - 1);
            
            for(int i=first; i<last+1; i++){
                list2.add(arr[i]);
            }
        }else{
            list2.add(-1);
        }
        
        int idx = 0;
        int[] answer = new int[list2.size()];
        for(int i : list2){
            answer[idx++] = i;
        }

        return answer;
    }
}