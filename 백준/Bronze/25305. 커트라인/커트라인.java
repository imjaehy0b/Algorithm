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
        int num = Integer.parseInt(st.nextToken());
        int limit = Integer.parseInt(st.nextToken());
        
        Integer[] arr = new Integer[num];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<num; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, Collections.reverseOrder());
        
    
        bw.write(String.valueOf(arr[limit-1]));
        bw.write("\n");
        bw.flush();
        bw.close();
        br.close();
        
    }
    
}