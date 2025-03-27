import java.util.*;
class Solution {
    public static String toBinaryWithPadding(int number, int length) {
        String binary = Integer.toBinaryString(number);
        int needZero = length - binary.length();

        if (needZero > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < needZero; i++) {
                sb.append('0');
            }
            sb.append(binary);
            return sb.toString();
        } else {
            return binary;
        }
    }
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i=0; i<n; i++){
            String s1 = toBinaryWithPadding(arr1[i],n);
            String s2 = toBinaryWithPadding(arr2[i],n);
            String str = "";
            
            for(int j=0; j<s1.length(); j++){
                if(s1.charAt(j)-'0' == 0 && s2.charAt(j)-'0' == 0){
                    str+= " ";
                }else{
                    str += "#";
                }
            }
            answer[i] = str;
            
        }


        
        
        
        return answer;
    }
}