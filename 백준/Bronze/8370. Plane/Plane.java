import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n1,k1,n2,k2;
        n1 = Integer.parseInt(st.nextToken());
        k1 = Integer.parseInt(st.nextToken());
        n2 = Integer.parseInt(st.nextToken());
        k2 = Integer.parseInt(st.nextToken());
        
        System.out.print((n1*k1)+(n2*k2));
        br.close();
    }
}