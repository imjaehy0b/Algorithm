import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = br.readLine(); //I am happy today
            String[] s = str[i].split(" ");//[I][am][happy][today]
            
            for(int j=0; j<s.length; j++){
                for(int k=s[j].length()-1; k>=0; k--){
                    bw.write(s[j].charAt(k));
                }
                if(j < s.length-1) {
                    bw.write(" ");
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}