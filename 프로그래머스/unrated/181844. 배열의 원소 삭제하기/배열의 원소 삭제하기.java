import java.util.*;
class Solution {
    public List solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        
        //기존의 arr 배열값을 list에 넣는다.
        for(int num : arr){
            list.add(num);
        }
        
        for(int delete : delete_list){
            //list에서 indexOf로 delete와 같은값을 가진 인덱스를 찾아준다.
            int index = list.indexOf(delete);
            
            //찾지 못했다면 -1 반환, 찾는다면 인덱스값을 반환하기때문에 
            //인덱스값이 나올경우 그 인덱스값을 remove 시켜준다.
            if(index != -1){
                list.remove(index);
            }
        }
        
        
        return list;
    }
}