package chap01;

import java.util.Scanner;

public class Median {
	// 3���� �������� �Է��ϰ� �߾Ӱ��� ���� ���� ����մϴ�.
	
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
		
		System.out.println("�� ������ �߾Ӱ��� ���մϴ�.");
		System.out.print("a : ");
		a = sc.nextInt();
		
		System.out.print("b : ");
		b = sc.nextInt();
		
		System.out.print("c : ");
		c = sc.nextInt();
		
		int med = med3(a,b,c);
		
		System.out.println("�߾Ӱ��� " + med + " �Դϴ�.");
	}

}
