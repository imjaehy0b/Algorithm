import java.util.*;
import java.io.*;

public class Main{
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        
        int[] x = new int[N];
        int[] y = new int[N];
        
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        
        int xMax = Arrays.stream(x).max().getAsInt();
        int xMin = Arrays.stream(x).min().getAsInt();
        int yMax = Arrays.stream(y).max().getAsInt();
        int yMin = Arrays.stream(y).min().getAsInt();
        
        bw.write(String.valueOf((xMax-xMin)*(yMax-yMin)));
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception{
        Main main = new Main();
        main.solution();
    }
}