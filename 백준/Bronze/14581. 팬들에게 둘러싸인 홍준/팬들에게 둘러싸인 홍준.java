import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    private void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String id = br.readLine(); // 홍준의 아이디를 먼저 입력받음
        
        for(int i=1; i<=9; i++){
            if(i==5) {
                sb.append(":").append(id).append(":");
            } else {
                sb.append(":fan:");
            }
            if(i%3==0) sb.append("\n");
        }
        System.out.print(sb);
    }
}