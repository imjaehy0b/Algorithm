import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i=0; i<arr.length; i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        for(int j=0; j<k; j++){
            if(list.size()>j){
                answer[j] = list.get(j);
            }else{
                answer[j] = -1;
            }
        }
        return answer;
    }
}