class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
    
        for(int i=0; i<board.length;i++){
            int[] arr = board[i];
            for(int j=0; j<arr.length; j++){
                if(i+j<=k){
                    answer += arr[j];
                }
            }

        }
        return answer;
    }
}