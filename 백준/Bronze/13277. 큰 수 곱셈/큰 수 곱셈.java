import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    private void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());
        System.out.print(a.multiply(b));
        br.close();
    }
}