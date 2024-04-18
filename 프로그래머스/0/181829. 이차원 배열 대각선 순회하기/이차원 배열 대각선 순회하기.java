class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        //i+j <= k 인 모든 i,j에 대한 borad의 합
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(i+j<=k){
                    answer += board[i][j];
                }
            }
        }
        return answer;
    }
}