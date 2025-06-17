import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    private void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int cnt = Integer.parseInt(br.readLine());
        String str = br.readLine();
        
        BigInteger result = BigInteger.ZERO;
        BigInteger base = BigInteger.valueOf(31);

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int value = ch - 'a' + 1;
            BigInteger term = BigInteger.valueOf(value).multiply(base.pow(i));
            result = result.add(term);
            
        }
        sb.append(result);
        System.out.print(sb);
    }
}