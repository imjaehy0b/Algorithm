import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        Map<String, String> map = new HashMap<>();
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(),st.nextToken());
        }
        
        ArrayList<String> arr = new ArrayList<>();
        for(Map.Entry<String, String> entry : map.entrySet()){
            if(entry.getValue().equals("enter")){
                arr.add(entry.getKey());
            }
        }
        arr.sort(Comparator.reverseOrder());
        
        for(String s : arr){
            bw.write(s+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}