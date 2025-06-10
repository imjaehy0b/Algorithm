import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder(); 
        
        for(int i = 0; i < n; i++){
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            
            boolean first = true;
            while(st.hasMoreTokens()){
                if(!first) {
                    bw.write(" ");
                }
                String word = st.nextToken();
                

                sb.setLength(0);           // 기존 내용 초기화
                sb.append(word);           // 단어 추가
                sb.reverse();              // 뒤집기
                bw.write(sb.toString());   // 출력
                
                first = false;
            }
            bw.write("\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}