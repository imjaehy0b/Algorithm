import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception{
		new Main().solution();
	}

	private void solution() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int row = Integer.parseInt(br.readLine());
		int col = Integer.parseInt(br.readLine());

		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}


}