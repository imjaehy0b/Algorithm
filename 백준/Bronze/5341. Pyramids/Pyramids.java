import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    private void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;
            sb.append(n*(n+1)/2);
            sb.append("\n");
        }
        
        System.out.println(sb);
        br.close();
    }
}