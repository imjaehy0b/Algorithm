import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception{
		new Main().solution();
	}

	private void solution() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());

		boolean[] list = sieve(end);
		for(int i=start;i<=end;i++){
			if(list[i]){
				sb.append(i+"\n");
			}
		}

		System.out.println(sb);
	}

	private boolean[] sieve(int end) {
		boolean[] isPrime = new boolean[end+1];
		Arrays.fill(isPrime,true);
		isPrime[0] = isPrime[1] = false;

		for(int i=2; i*i <= end; i++){
			if(isPrime[i]){
				for(int j= i*i; j<= end; j+= i){
					isPrime[j] = false;
				}
			}
		}
		return isPrime;
	}
}