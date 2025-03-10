import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine(); 
        String n = input;

        int cycle = 0;
        while(true){
            if(n.length() == 1) n = "0" + n;
            
            int one = n.charAt(0) - '0'; 
            int two = n.charAt(1) - '0'; 
            
            int sum = one+two;
          
            n = String.valueOf(two) + String.valueOf(sum%10);
            
            cycle++;
            if(Integer.parseInt(n) == Integer.parseInt(input)) break;
            
        }
        
        bw.write(String.valueOf(cycle));
        bw.flush();
        bw.close();
        br.close();
        
    }
}