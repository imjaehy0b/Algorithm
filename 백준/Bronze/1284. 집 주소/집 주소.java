import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		new Main().solution();
	}

	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str;
		while ((str = br.readLine()) != null && !str.equals("0")) {
			int sum = 2;
			sum += str.length() - 1;

			for (int i = 0; i < str.length(); i++) {
				switch (str.charAt(i) - '0') {
					case 1:
						sum += 2;
						break;
					case 0:
						sum += 4;
						break;
					default:
						sum += 3;
				}
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
	}
}