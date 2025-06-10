import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
    
    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0) break;
            
            if(a > b) sb.append("Yes\n");
            else sb.append("No\n");
        }
        
        br.close();
        System.out.println(sb);
    }
}