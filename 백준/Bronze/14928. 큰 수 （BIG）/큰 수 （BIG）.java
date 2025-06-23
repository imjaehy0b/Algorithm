import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    private void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int mod = 20000303;
        long pow = 1;  
        long result = 0;  
        
        for(int i = num.length()-1; i >= 0; i--){
            //큰 수의 각 자릿수
            int digit = num.charAt(i) - '0';
            
            //(자릿수 × 거듭제곱값) % 나머지연산값
            long temp = (digit * pow) % mod;
            result = (result + temp) % mod;
            
            // 다음 거듭제곱값 계산: (현재값 × 10) % 나머지연산값
            pow = (pow * 10) % mod; 
        }
        
        System.out.println(result);
    }
}