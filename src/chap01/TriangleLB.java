package chap01;

import java.util.Scanner;

public class TriangleLB {
	// ���� �Ʒ��� ������ �̵ �ﰢ�� ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.");
		
		int n;
		do {
			System.out.print("�� �� �ﰢ�� �Դϱ�? : ");
			n = sc.nextInt();
		}while(n <=0);
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
