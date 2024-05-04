class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[1].length];
        //크기가 같은 두 행열
        //arr1[i][j] + arr2[i][j]
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[1].length;j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}