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
            String cal = br.readLine();
            if(cal == null) break;
            StringTokenizer st = new StringTokenizer(cal);
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            sb.append(m/(n+1));
            sb.append('\n');
        }
        System.out.println(sb);
    }
}