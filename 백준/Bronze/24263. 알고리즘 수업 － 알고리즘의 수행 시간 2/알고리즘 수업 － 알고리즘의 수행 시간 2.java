import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        br.close();
        
        bw.write(String.valueOf(n));
        bw.write('\n');
        bw.write(String.valueOf(1));
        bw.flush();
        bw.close();
    }
}