import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {-1};
        ArrayList<Integer> list = new ArrayList<>();
        int count1 = 0;
        for(int i=l; i< r+1; i++){
            String strNum = String.valueOf(i); 
            int count2 = 0;
            for(int j=0; j<strNum.length(); j++){ 
                if(strNum.charAt(j)=='0'||strNum.charAt(j)=='5'){
                    count2++;
                }
            }
            
            if(count2==strNum.length()){
                count1++;
                list.add(i);
            }
        }
        
        if(count1==0){
            return answer;
        }
        answer = new int[list.size()];
        for(int j=0; j<answer.length;j++){
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}