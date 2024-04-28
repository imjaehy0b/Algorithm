import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            int result = Integer.parseInt(str[0])+Integer.parseInt(str[1]);
            sb.append(result+"\n");
        }
        br.close();
        System.out.print(sb);
    }
}