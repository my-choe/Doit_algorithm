package chap02;

import java.util.Scanner;

public class SumOf {
	
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i = 0 ; i < a.length ; i++)
			sum += a[i];
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수 입력 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("arr배열 요소의  합계는 " + sumOf(arr) + " 입니다.");
		
	}

}
