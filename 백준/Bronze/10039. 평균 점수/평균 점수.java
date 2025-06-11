import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    private void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        int total = 0;
        for(int i=0; i<5; i++){
            int n = Integer.parseInt(br.readLine());
            
            if(n>=40){
                total += n;
            }else{
                total += 40;
            }
        }
        
        System.out.print(total/5);
    }
}