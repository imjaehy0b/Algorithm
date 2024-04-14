import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int idx = 0;
        int a = slicer[0], b=slicer[1], c=slicer[2];
        ArrayList<Integer> arr = new ArrayList<>();
        //2,0,1,1,[10, 8, 6, 4, 2]
        switch(n){
            case 1:
                for(int i=0; i<=b;i++){
                    arr.add(num_list[i]);
                }
                break;
            case 2:
                for(int i=a;i<num_list.length;i++){
                    arr.add(num_list[i]);
                }
                break;
            case 3:
                for(int i=a; i<=b; i++){
                    arr.add(num_list[i]);
                }
                break;
            case 4:
                for(int i=a; i<=b; i+=c){
                    arr.add(num_list[i]);
                }
                break;
        }
        int[] answer = new int[arr.size()];
        for(int i : arr){
            answer[idx++] = i;
        }
        return answer;
    }
}