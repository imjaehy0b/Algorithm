import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> list = new ArrayList<>();
        //flag의 크기만큼 반복, flag[i]가 트루라면 answer에 arr[i]값의 *2번만큼 저장
        //false라면 answer의 마지막 index를 arr[i]값만큼 제거하고
        //배열의 길이를 알수없고 스택형식의 구조를 가지고있음
        //ArrayList를 사용하는게 맞아보인다.
        
        for(int i=0; i<arr.length; i++){
            if(flag[i]){
                for(int j=0; j<arr[i]*2; j++){
                    list.add(arr[i]);
                }
            }else{
                for(int j=0; j<arr[i]; j++){
                    list.remove(list.size() - 1);
                }
            }
        }
        
        int idx = 0;
        int[] answer = new int[list.size()];
        for(int i : list){
            answer[idx++] = i;
        }
    

        
        return answer;
    }
}