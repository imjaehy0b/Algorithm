import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] list = new int[num_list.length+1];
        
        int size = num_list.length-1;
        int last =  num_list[size];
        int Previous =  num_list[size-1];
        int num = 0;
        
        for(int i =0; i<list.length-1; i++){
            list[i] = num_list[i];
        }
        

        if(last>Previous){
            num = last-Previous;
            list[num_list.length] = num;
        }else{
            num = last*2;
            list[num_list.length] = num;
        }
        

     
        return list;
    }
}