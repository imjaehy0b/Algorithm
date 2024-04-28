import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=n; i++){
            String[] str = br.readLine().split(" ");
            int result = Integer.parseInt(str[0])+Integer.parseInt(str[1]);
            sb.append("Case #"+i+": "+result+"\n");    
        }
        br.close();
        System.out.print(sb);
    }
}