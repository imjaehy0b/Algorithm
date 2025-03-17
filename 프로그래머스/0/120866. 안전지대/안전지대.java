class Solution {
    public int solution(int[][] board) {        
        int n = board.length;
        int[][] temp = new int[n][n];
        
        // 원본 배열 복사
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[i][j] = board[i][j];
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == 1){
                    // 상
                    if (i > 0) temp[i-1][j] = 1;
                    
                    // 상좌
                    if (i > 0 && j > 0) temp[i-1][j-1] = 1;
                    
                    // 상우
                    if (i > 0 && j < n-1) temp[i-1][j+1] = 1;
                    
                    // 좌
                    if (j > 0) temp[i][j-1] = 1;
                    
                    // 우
                    if (j < n-1) temp[i][j+1] = 1;
                    
                    // 하
                    if (i < n-1) temp[i+1][j] = 1;
                    
                    // 하좌
                    if (i < n-1 && j > 0) temp[i+1][j-1] = 1;
                    
                    // 하우
                    if (i < n-1 && j < n-1) temp[i+1][j+1] = 1;
                    
                }
            }
        }
        int safeZoneCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (temp[i][j] == 0) {
                    safeZoneCount++;
                }
            }
        }
        return safeZoneCount;
    }
}
