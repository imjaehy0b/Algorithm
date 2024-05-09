import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int width = Integer.MIN_VALUE;
        int height = Integer.MIN_VALUE;
        int[][] arr = new int[sizes.length][2];
        int i=0;
        //큰값을 가로, 작은값을 세로로 옮기고
        //옮긴값중 가장 큰값들
        for(int[] size : sizes){
            int w = size[0];
            int h = size[1];
            if(w>h){
                arr[i][0] = w;
                arr[i][1] = h;
            }else{
                arr[i][0] = h;
                arr[i][1] = w;
            }
            i++;
        }
        for(int[] a : arr){
            int w = a[0];
            int h = a[1];
            if(w>=width){
                width=w;
            }
            if(h>=height){
                height=h;
            }
        }

        
        return answer=width*height;
    }
}