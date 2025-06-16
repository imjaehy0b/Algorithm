import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    private void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int value1 = Integer.parseInt(st.nextToken());
        int value2 = Integer.parseInt(st.nextToken());
    
        
        int row1 = (value1-1) % 4;
        int col1 = (value1-1) / 4;
    
        int row2 = (value2-1) % 4;
        int col2 = (value2-1) / 4;
    
        int distance = Math.abs(row1-row2) + Math.abs(col1-col2);
    
        System.out.print(distance);
    }
}