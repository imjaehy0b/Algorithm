import java.util.*;
import java.io.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Integer[] arr = new Integer[1000];
        Arrays.fill(arr,0);
        
        for(int i : array){
            arr[i]++;
        }
        
        int max = 0;
        int cnt = 0;
        for(int i=0; i<1000; i++){
            if(arr[i]>max){
                max = arr[i];
                answer = i;
                cnt = 0;
            }else if(arr[i] == max){
                cnt++;
            }
        }
        
        if(cnt >= 1){
            answer = -1;
        }
        

        return answer;
    }
}