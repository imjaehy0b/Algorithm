import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        String[][] arr = new String[n][2];
        
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken(); //X
            arr[i][1] = st.nextToken(); //Y
        }
        
        Arrays.sort(arr, (a,b)->{
            int aX = Integer.parseInt(a[0]); 
            int bX = Integer.parseInt(b[0]); 
            int aY = Integer.parseInt(a[1]); 
            int bY = Integer.parseInt(b[1]); 
            if(aX != bX){
                return aX-bX;
            }else{
                return aY-bY;
            }
        });
           
        for(int i=0; i<n; i++){
            bw.write(arr[i][0]+" "+arr[i][1]+"\n");
        }
            bw.flush();
            bw.close();
            br.close();
    }
}