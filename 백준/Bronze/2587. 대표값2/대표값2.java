import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    public void solution() throws Exception{
        //전부 합치고 평균값 구한뒤 정렬해서 /2한값에 +1 해서 중앙값 구하기 (홀수고정이라)
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] arr = new int[5];
        int sum = 0;
        for(int i=0; i<5; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        
        Arrays.sort(arr);
        
        bw.write(String.valueOf(sum/5));
        bw.write("\n");
        bw.write(String.valueOf(arr[5/2]));
        bw.flush();
        bw.close();
        br.close();
    }
}