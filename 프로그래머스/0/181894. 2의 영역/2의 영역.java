import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int start = -1;
        int end = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==2){
                start = i;
                break;
            }
        }
        for(int j=0; j<arr.length; j++){
            if(arr[arr.length-j-1]==2){
                end=arr.length-j-1;
                break;
            }
        }
        if(end==-1&&start==-1){
            answer.add(-1);
        }else{
            for(int i=start; i<=end; i++){
                answer.add(arr[i]);
            }
        }
        
        
        return answer;
    }
}