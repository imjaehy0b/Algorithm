import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        br.close();
        
        int bag  = 3;
        int bag2 = 5;
        int cnt = 0;
        
        cnt += num / 5;
        num %= 5;
        while(num > 0){
            if(num%bag == 0){
                cnt += num/bag;
                num = 0;
                break;
            }
            
            if(cnt > 0){
                cnt--;
                num+=5;
            }else{
                bw.write(String.valueOf(-1));
                bw.flush();
                bw.close();
                return;
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        
        
    }
}