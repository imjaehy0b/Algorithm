import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());    
            map.put(st.nextToken(),i);
        }
        
        int cnt = 0;
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            if(map.containsKey(st.nextToken())){
                cnt++;
            }
        }
        
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
        
        
        
    }
}