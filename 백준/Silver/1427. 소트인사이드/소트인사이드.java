import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        
        Integer[] arr = new Integer[str.length()];
        for(int i=0; i<str.length(); i++){
            arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(int i=0; i<arr.length; i++){
            bw.write(String.valueOf(arr[i]));
        }
        
        bw.flush();
        bw.close();
        br.close();
    }       
}