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
        int one = Integer.parseInt(st.nextToken());
        int two = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<one; i++){
            map.put(br.readLine(),i);
        }
        int cnt = 0;
        for(int i=0; i<two; i++){
            String name = br.readLine();
            if(map.containsKey(name)){
                list.add(name);
                cnt++;
            }
        }
        Collections.sort(list);
        bw.write(String.valueOf(cnt)+"\n");
        for(String s : list){
            bw.write(s + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}