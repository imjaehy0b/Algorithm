import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger sum  = new BigInteger(br.readLine());
        BigInteger diff = new BigInteger(br.readLine());
        BigInteger two  = new BigInteger("2");
        
        BigInteger klaudia = (sum.subtract(diff)).divide(two).add(diff);
        BigInteger natalia = (sum.subtract(diff)).divide(two); 
        
        System.out.println(klaudia);
        System.out.println(natalia); 
    }
 
}