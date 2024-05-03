import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
      
        return min(arr);
    }
    
    public int[] min(int[] arr){
        if(arr.length==1){
            int[] newArr = {-1};
            return newArr;
        }
        int[] temp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(temp);
        int min = temp[0];
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(min<arr[i]){
                list.add(arr[i]);
            }
        }
        int[] minArr = new int[list.size()];
        int idx=0;
        for(int i : list){
            minArr[idx++] = i;
        }
   
        return minArr;
    }
}