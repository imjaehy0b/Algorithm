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
		for(int i = 0; i < cnt; i++){
			String str = br.readLine();
			if(str.length() < 6 || str.length() > 9){
				sb.append("no\n");
			}else{
				sb.append("yes\n");
			}
		}
		br.close();
		System.out.println(sb);
	}
}