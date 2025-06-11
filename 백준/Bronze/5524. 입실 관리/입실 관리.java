import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    private void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int cnt = Integer.parseInt(br.readLine());
        
        for(int i=0; i<cnt; i++){
            sb.append(br.readLine().toLowerCase());
            sb.append("\n");
        }
        
        System.out.print(sb);
    }
}