class Solution {
    public int[] solution(int[] arr) {
        int len = 0;
        int idx = 0;
        for(int a : arr) len += a;
        int[] answer = new int[len];
        for(int num : arr){
            for(int i=0; i<num; i++){
                answer[idx++] = num;
            }
        }
        return answer;
    }
}