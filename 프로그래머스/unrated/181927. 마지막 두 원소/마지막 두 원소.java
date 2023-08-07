import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        List<int> nums = new ArrayList<>();
        
        int size = num_list.length-1;
        int last =  num_list[size];
        int Previous =  num_list[size-1];
        int num = 0;
        
        //마지막 idx가 더 크면 이전 값 -해줌
        //아니라면 마지막idx값을 *2
        if(last>Previous){
            num = last-Previous;
        }else{
            num = last*2;
        }
        System.out.println(num);

     
        return nums;
    }
}