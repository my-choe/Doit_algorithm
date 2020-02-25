package chap01;

import java.util.Scanner;

public class SumWhile {
	// 1,2...n의 합을 구합니다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = sc.nextInt();
		
		int sum = 0;	// 합
		int i = 1;
		
		while(i <= n) {	// i가 n이하면 반복
			sum += i;	// sum에 i를 더함
			i++;		// i값을 1만큼 증가
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		System.out.println("i의 값은 " + i + "가(이) 되었습니다.");
	}

}
