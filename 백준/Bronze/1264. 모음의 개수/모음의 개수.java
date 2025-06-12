import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    private void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String str = br.readLine().toLowerCase();
            if(str.equals("#")) break;
            
            int cnt = str.replaceAll("[^aeiou]", "").length();

            sb.append(cnt);
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}