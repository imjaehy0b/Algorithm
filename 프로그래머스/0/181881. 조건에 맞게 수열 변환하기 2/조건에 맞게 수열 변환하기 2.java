import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int count=0;
        int[] x = new int[arr.length];

        while(!Arrays.equals(x,arr)){
            answer++;
            for(int j=0; j<arr.length; j++){
                x[j] = arr[j];
            }
            for(int i=0; i<arr.length; i++){
                if(arr[i]>=50&&arr[i]%2==0){
                    arr[i] /= 2;
                }else if(arr[i]<50 &&arr[i]%2!=0){
                    arr[i] *=  2 + 1;
                }
            }
            if(Arrays.equals(x,arr)&&answer==1){
                answer--;
                break;
            }
        }
        
        
        
        return answer;
    }
}