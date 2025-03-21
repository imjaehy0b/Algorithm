import java.util.*;
class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        Integer[] arr = new Integer[strArr.length];
        
        for(int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);    
        }
        
        Arrays.sort(arr);
        
        return arr[0] + " " + arr[arr.length-1];
    }
}