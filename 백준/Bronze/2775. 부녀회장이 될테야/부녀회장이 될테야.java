import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    private void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[][] apt = new int[15][15];
        
        // 0층 i호에는 i명이 산다
        for(int i=1; i<15; i++){
            apt[0][i] = i;
        }
        
        // 각 층의 1호는 항상 1명
        for(int i=1; i<15; i++){
            apt[i][1] = 1;
        }
        
        for(int i=1; i<15; i++){
            for(int j=2; j<15; j++){   
                apt[i][j] = apt[i][j-1] + apt[i-1][j];
            }
        }
        
        int cnt = Integer.parseInt(br.readLine());
        for(int i=0; i<cnt; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            
            sb.append(apt[k][n]);
            sb.append("\n");
        }
        
        System.out.print(sb);
    }
}