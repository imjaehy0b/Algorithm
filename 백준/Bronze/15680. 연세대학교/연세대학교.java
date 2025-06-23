import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    private void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        if(num == 0){
            System.out.print("YONSEI");
        }else{
            System.out.print("Leading the Way to the Future");
        }
    }
}