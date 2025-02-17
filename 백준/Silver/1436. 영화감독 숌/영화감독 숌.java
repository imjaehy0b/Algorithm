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
        
        int cnt = 0;
        int number = 666;
        while(cnt < n){
            if(contain666(number)){
                cnt++;
                if(cnt == n){
                    bw.write(String.valueOf(number));
                    break;
                }
            }
            number++;
        }
        bw.flush();
        bw.close();
    }
    
    public boolean contain666(int num){
        String numStr = String.valueOf(num);
        return numStr.contains("666");
    }
}