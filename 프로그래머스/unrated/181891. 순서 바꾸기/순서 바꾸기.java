class Solution {
    public int[] solution(int[] num, int n) {
        int[] answer = new int[num.length];
        int idx = 0;
        for(int i=n; i<num.length; i++){
            answer[idx++] = num[i];
        }

        for(int i=0; i<n; i++){
            answer[idx++] = num[i];
        }

        
        return answer;
    }
}