import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
    
    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String jae = br.readLine();
        String dr = br.readLine();
        
        
        if(jae.length() >= dr.length()) sb.append("go");
        else sb.append("no");
        
        System.out.println(sb);
        br.close();
    }
}