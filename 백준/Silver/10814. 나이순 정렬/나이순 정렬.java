import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    void solution() throws Exception{
        //나이순 정렬
        //나이가 같으면 배열의 순서가 빠른것.
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        String[][] member = new String[n][2];
        
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            member[i][0] = st.nextToken(); // 나이
            member[i][1] = st.nextToken(); // 이름
        }
        
        Arrays.sort(member, (a,b) -> {
            int ageA = Integer.parseInt(a[0]);
            int ageB = Integer.parseInt(b[0]);
            
            if(ageA != ageB){
                return ageA - ageB;
            }else{
                return 0;
            }
        });
        
        for(int i=0; i<n; i++){
            bw.write(member[i][0]+" "+member[i][1]+"\n");    
        }
        bw.flush();
        bw.close();
        br.close();        
        
    }
}