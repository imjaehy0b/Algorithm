package src;

import java.util.Scanner;

// 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
// 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.

public class java01 {
	public static int solution(String str, char c){
		int answer = 0;
		str = str.toLowerCase();
		c = Character.toUpperCase(c);

		return answer;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char c = sc.next().charAt(0);
		int res = solution(str, c);

		System.out.println(res);
	}

}


/*  내 코드
	Scanner in = new Scanner(System.in);
    String input1 = in.nextLine();
    String input2 = in.nextLine();
    int cnt = 0;

    input2 = input2.toLowerCase();

    for (int i = 0; i < input1.length(); i++) {
      char c = input1.charAt(i);
      // 첫 번째 문자열의 문자를 소문자로 변환 후 비교
      if (input2.equals(String.valueOf(c).toLowerCase())) {
        cnt++;
      }
    }

    System.out.print(cnt);
*/