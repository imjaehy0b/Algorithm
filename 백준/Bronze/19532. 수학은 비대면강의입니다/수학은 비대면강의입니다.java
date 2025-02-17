import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] nums = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<nums.length; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        
        int d = nums[3];
        int e = nums[4];
        int f = nums[5];
        
        
        int x = (e*c - b*f) / (a*e - b*d);
        int y = (c*d - a*f) / (b*d - e*a);
        
        bw.write(String.valueOf(x));
        bw.write("\n");
        bw.write(String.valueOf(y));
        bw.flush();
        bw.close();
        
        
    }
}