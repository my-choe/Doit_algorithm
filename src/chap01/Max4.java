package chap01;

import java.util.Scanner;

public class Max4_01_01 {
	// 네 값의 최댓값을 구하는 max4 메서드를 작성하세요.
	
	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if(b > max)
			max = b;
		if(c > max)
			max = c;
		if(d > max)
			max = d;
		
		return max;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		
		System.out.print("a : ");
		a = sc.nextInt();
		
		System.out.print("b : ");
		b = sc.nextInt();
		
		System.out.print("c : ");
		c = sc.nextInt();
		
		System.out.print("d : ");
		d = sc.nextInt();
		
		int max = max4(a,b,c,d);
		
		System.out.println("네 값의 최댓값은 " + max + "입니다.");
		
		

	}

}
