import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] side = new int[3];
        side[0] = Integer.parseInt(st.nextToken());
        side[1] = Integer.parseInt(st.nextToken());
        side[2] = Integer.parseInt(st.nextToken());
        Arrays.sort(side);
        

        //가장 긴변의 길이가 두 변의 합보다 작아야한다.
        if(side[0] + side[1] <= side[2]) {
            bw.write(String.valueOf((side[0] + side[1]) * 2 - 1));
        } else {
            bw.write(String.valueOf(side[0] + side[1] + side[2]));
        }
        
        bw.flush();
        bw.close();
        
        
    }
}