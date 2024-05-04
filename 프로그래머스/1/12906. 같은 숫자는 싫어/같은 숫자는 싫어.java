import java.util.*;

public class Solution {
    public int[] duplicate(int[] array){
        //연속된 숫자는 마지막값만 넣기
        //list에 arr[0]을넣고 list.get(idx)와 arr[i]가 같지않을때 list.add(arr[i]) 후 idx++
        int idx = 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(array[0]);
        for(int i=0; i<array.length; i++){
            if(list.get(idx)!=array[i]){
                list.add(array[i]);
                idx++;
            }
        }
        int[] newArr = new int[list.size()];
        int j=0;
        for(int i : list){
            newArr[j++] = i;
        }

        return newArr;
    }
    
    public int[] solution(int[] arr) {
        int[] answer = duplicate(arr);

        return answer;
    }
}