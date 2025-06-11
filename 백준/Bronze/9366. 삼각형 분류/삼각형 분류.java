import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    private void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());
        
        for(int i=0; i<cnt; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            if(a+b <= c || b+c <= a || a+c <= b){
                sb.append("Case #").append(i+1).append(": invalid!\n");
            }else if (a == b && b == c) {
                sb.append("Case #").append(i+1).append(": equilateral\n");
            }else if (a == b || b == c || a == c) {
                sb.append("Case #").append(i+1).append(": isosceles\n");
            }else{
                sb.append("Case #").append(i+1).append(": scalene\n");
            }
        }
        
        System.out.print(sb.toString());
    }
    
    
}