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
        
        for(int testCase = 0; testCase < 3; testCase++){
            int n = Integer.parseInt(br.readLine());
            
            BigInteger sum = BigInteger.ZERO;
            for(int i = 0; i < n; i++){
                BigInteger num = new BigInteger(br.readLine());
                sum = sum.add(num);
            }
            
            if(sum.equals(BigInteger.ZERO)){
                sb.append("0");
            } else if(sum.compareTo(BigInteger.ZERO) > 0){
                sb.append("+");
            } else {
                sb.append("-");
            }
            sb.append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}