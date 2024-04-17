import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<delete_list.length;j++){
                if(arr[i]==delete_list[j]){
                    arr[i] = 0;
                    break;
                }
            }
            System.out.println();
        }
        for(int num : arr){
            if(num!=0)
                list.add(num);
            
        }
        int[] answer = new int[list.size()];
        for(int j=0; j<answer.length;j++){
            answer[j] = list.get(j);
        }
        return answer;
    }
}