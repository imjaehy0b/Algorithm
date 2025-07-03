import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception{
		new Main().solution();
	}

	private void solution() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		int cnt = Integer.parseInt(br.readLine());

		for(int i = 0; i < cnt; i++){
			int n = Integer.parseInt(br.readLine());
			if(n != 0){
				stack.push(n);
			}else {
				stack.pop();
			}
		}

		int sum = 0;
		while(!stack.isEmpty()) {
			sum += stack.pop();
		}
		System.out.println(sum);
	}
}