package chap01;

import java.util.Scanner;

public class Digits {
	// 2자리 양수로 입력값 제한
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		
		System.out.println("2자리의 정수를 입력하세요.");
		
		do{
			System.out.print("입력 : ");
			no = sc.nextInt();
		}while(no < 10 || no >= 100);
		
		System.out.println("변수 no의 값은 " + no + "(이)가 되었습니다.");
	}

}
