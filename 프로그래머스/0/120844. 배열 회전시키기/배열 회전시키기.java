import java.util.*;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        ArrayList<Integer> arr = new ArrayList<>();
        if(direction.equals("right")){
            arr.add(numbers[numbers.length-1]);
            for(int i=0; i<numbers.length-1; i++){
                arr.add(numbers[i]);
            }
        }else{
            for(int i=1; i<numbers.length; i++){
                arr.add(numbers[i]);
            }
                arr.add(numbers[0]);
        }
        for(int i=0; i<numbers.length;i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}