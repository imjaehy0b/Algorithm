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
        
        //하나의 map 사용하니 모든 map엔트리를 조회하여 시간초과가 발생
        //key,value 조회용을 각각만들어 시간복잡도를 낮춤
        Map<Integer, String> indexToName = new HashMap<>();
        Map<String, Integer> nameToIndex = new HashMap<>();
        
        for(int i=0; i<n; i++){
            String name = br.readLine();
            int index = i+1;
            indexToName.put(index, name);
            nameToIndex.put(name, index);
        }
        
        for(int i=0; i<m; i++){
            String s = br.readLine();
            if(isNumeric(s)){
                bw.write(indexToName.get(Integer.parseInt(s)));
            }else{
                bw.write(String.valueOf(nameToIndex.get(s)));
            }
            bw.write("\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
        
        
        
    }
    
    private static boolean isNumeric(String str) {
    try {
        Integer.parseInt(str);
        return true;
    } catch(NumberFormatException e) {
        return false;
    }
}
}