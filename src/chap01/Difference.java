package chap01;

import java.util.Scanner;

public class Difference {
	// ���� b���� ���� a�� �� ���� ���մϴ�(b > a�� �ǵ��� �Է� ����)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a�� �� : ");
		int a = sc.nextInt();
		
		int b = 0;
		while(true) {
			System.out.print("b�� �� : ");
			b = sc.nextInt();
			if(b > a)
				break;
			else
				System.out.println("a���� ū ���� �Է��ϼ���!");
		}

		System.out.println("b - a�� " + (b-a) + "�Դϴ�.");
	}

}
