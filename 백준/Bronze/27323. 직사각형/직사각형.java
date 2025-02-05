import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        
        int result = x * y;
        
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}