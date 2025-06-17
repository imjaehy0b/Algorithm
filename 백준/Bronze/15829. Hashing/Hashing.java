import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    private void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int cnt = Integer.parseInt(br.readLine());
        String str = br.readLine();
        
        BigInteger result = BigInteger.ZERO;
        BigInteger power = BigInteger.ONE;
        BigInteger base = BigInteger.valueOf(31);
        BigInteger mod = BigInteger.valueOf(1234567891);

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int value = ch - 'a' + 1;
            
            BigInteger temp = BigInteger.valueOf(value).multiply(power);
            result = result.add(temp).remainder(mod);
            
            power = power.multiply(base).remainder(mod);
            
        }
        System.out.print(result);
    }
}