package chap01;

import java.util.Scanner;

public class Median {
	// 3개의 정숫값을 입력하고 중앙값을 구한 다음 출력합니다.
	
	static int med3(int a, int b, int c) {
		if(a >= b)
			if(b >= c)
				return b;
			else if(a <= c)
				return a;
			else
				return c;
		else if(a > c)
			return a;
		else if(b > c)
			return c;
		else
			return b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.print("a : ");
		a = sc.nextInt();
		
		System.out.print("b : ");
		b = sc.nextInt();
		
		System.out.print("c : ");
		c = sc.nextInt();
		
		int med = med3(a,b,c);
		
		System.out.println("중앙값은 " + med + " 입니다.");
	}

}
