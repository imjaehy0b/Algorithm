import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[] args) throws Exception{
		new Main().solution();
	}

	private void solution() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numCnt = Integer.parseInt(br.readLine());
		int[] idea = new int[numCnt];
		for(int i = 0; i< numCnt; i++){
			idea[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(idea);

		int trunc = (int) Math.round(numCnt * 0.15);

		double sum = 0;
		for(int i = trunc; i< numCnt - trunc; i++){
			sum += idea[i];
		}
		System.out.println((int)Math.round(sum/(numCnt - trunc *2)));
		
	}
}