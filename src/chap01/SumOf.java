package chap01;

import java.util.Scanner;

public class SumOf {
	// 정수a,b포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드 작성
	
	static int sumof(int a, int b) {
		int min;
		int max;
		
		if(a > b) {
			max = a;
			min = b;
		}else {
			max = b;
			min = a;
		}
		
		int sum = 0;
		
		for(int i = min ; min <= max ; min++)
			sum += i;
		
		return (sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 a부터 b까지의 합을 구합니다.");
		
		System.out.print("a의 값 : ");
		int a = sc.nextInt();
		
		System.out.print("b의 값 : ");
		int b = sc.nextInt();
		
		System.out.println(a + "부터 " + b + "까지의 합은 " + sumof(a,b) + "입니다.");
	}

}
