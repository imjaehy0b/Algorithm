import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        ArrayList<Integer> aList = new ArrayList<>();
        ArrayList<Integer> bList = new ArrayList<>();
        int row = arr.length; //행
        int col = arr[0].length; //열

        if(row>col){
            //행의 수가 더 많다면 열의 수가 행의수와 같아지도록 0추가
            int[][] answer = new int[row][row];
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    answer[i][j] = arr[i][j];
                }
            }
            return answer;
        }else if(row<col){
            //열의 수가 더 많다면 행의 수가 열의수와 같아지도록 0 추가
            int[][] answer = new int[col][col];
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    answer[i][j] = arr[i][j];
                }
            }
            return answer;
        }else{
            int[][] answer = new int[row][col];
            for(int i=0; i<row;i++){
                for(int j=0; j<col; j++){
                    answer[i][j] = arr[i][j];
                }
            }
            return answer;

        }

    }
}