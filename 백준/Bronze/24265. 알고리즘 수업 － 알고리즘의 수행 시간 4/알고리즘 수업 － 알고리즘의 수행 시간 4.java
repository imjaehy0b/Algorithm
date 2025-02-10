import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    void solution() throws Exception{
        //i = 1 to n-1 -> 1 2 3 4 5 6
        //j = i+1 to n -> 234567 34567 4567 567 56 7
        //1~n까지의 합계는 n(n+1)/2

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        br.close();
        
        
        bw.write(String.valueOf((n * (n-1)) / 2));  
        bw.write("\n");                       
        bw.write(String.valueOf(2));          
        bw.flush();
        bw.close();
        
    }
}