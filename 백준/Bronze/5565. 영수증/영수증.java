import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception{
		new Main().solution();
	}

	private void solution() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int totalPrice = 0;
		for (int i = 0; i < 10; i++) {
			if(i==0){
				totalPrice = Integer.parseInt(br.readLine());
			}else{
				totalPrice -= Integer.parseInt(br.readLine());
			}
		}

		System.out.println(totalPrice);
	}
}