import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception{
		new Main().solution();
	}

	private void solution() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int distance = Integer.parseInt(br.readLine());
		int min = 0;

		if(distance%5 == 0){
			min = distance/5;
		}else{
			min = distance/5 + 1;
		}

		System.out.println(min);
	}
}