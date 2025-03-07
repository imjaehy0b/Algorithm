import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
void solution() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int n = Integer.parseInt(br.readLine());
    Map<String, Integer> cntMap = new HashMap<>();  
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
        String key = st.nextToken();
        cntMap.put(key, cntMap.getOrDefault(key, 0) + 1);
    }
    
    int m = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    st = new StringTokenizer(br.readLine());
    
    for (int i = 0; i < m; i++) {
        String key = st.nextToken();
        sb.append(cntMap.getOrDefault(key, 0));
      
        if (i < m - 1) {
            sb.append(" ");
        }
    }
    
    bw.write(sb.toString());
    bw.newLine();
    bw.flush();
    bw.close();
    br.close();
}
    /*
    시간복잡도에대한 감이 없어서 시간초과 발생;
    void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Map<Integer,String> map = new HashMap<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            map.put(i,st.nextToken());
        }
        
        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[m];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            String key = st.nextToken();
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getValue().equals(key)) {
                    arr[i] += 1;
                }
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
    */
}