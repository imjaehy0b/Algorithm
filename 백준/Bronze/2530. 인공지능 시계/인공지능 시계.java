import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception{
		new Main().solution();
	}

	private void solution() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		int sec = Integer.parseInt(st.nextToken());
		int time = Integer.parseInt(br.readLine());

		int totalSec = sec+time;


		min += totalSec/60;
		totalSec %= 60;

		hour += min/60;
		min %= 60;

		hour%=24;

		System.out.println(hour+" "+min+" "+totalSec);
	}
}