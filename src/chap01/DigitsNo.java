package chap01;

import java.util.Scanner;

public class DigitsNo {
	// 양의 정수값의 자릿수를 구하여 나타냄
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n ;
		
		do {
			System.out.print("n의 정수값  : ");
			n = sc.nextInt();
		}while(n < 0);
		
		int no = 0;				// 자릿수
		
		while(n > 0) {
			n /= 10;			// n을 10으로 나눔
			no++;
		}
		
		System.out.println("해당 숫자는 " + no + "자리 수 입니다.");

	}

}
