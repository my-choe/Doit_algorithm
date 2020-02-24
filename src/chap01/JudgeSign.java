package chap01;

import java.util.Scanner;

public class JudgeSign {
	// 입력한 정숫값이 양수인지 음수인지 0인지 판단합니다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. : ");
		int num = sc.nextInt();
		
		if(num > 0)
			System.out.println(num + "은(는) 양수입니다.");
		else if(num < 0)
			System.out.println(num + "은(는) 음수입니다.");
		else
			System.out.println(num + "은 0입니다.");
	}

}
