package chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
	// 배열 요소 최댓값 구하기(난수 값 생성)
	
	static int maxOf(int[] a) {
		int max = a[0];
		
		for(int i = 1; i < a.length ; i++) {
			if(a[i] > max)
				max = a[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = sc.nextInt();
		
		int[] height = new int[num];

		System.out.println("키 값은 아래와 같습니다.");
		
		for(int i = 0 ; i < height.length ; i++) {
			height[i] = 100 + rand.nextInt(90);		// 100 + (0~89) >>> 키 값 : 100~189
			System.out.println("height[" + i + "] : " + height[i]);
		}
		
		System.out.println("최댓값은 " + maxOf(height) + " 입니다.");
	}

}
