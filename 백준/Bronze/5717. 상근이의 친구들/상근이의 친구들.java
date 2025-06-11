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
            StringTokenizer st = new StringTokenizer(br.readLine());
            int man = Integer.parseInt(st.nextToken());
            int girl = Integer.parseInt(st.nextToken());
            
            if(man + girl == 0) break;
            
            sb.append(man + girl);
            sb.append("\n");
        }
        
        System.out.println(sb);
        br.close();
    }
}