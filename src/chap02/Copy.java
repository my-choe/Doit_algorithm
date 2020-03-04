package chap02;

import java.util.Scanner;

public class Copy {
	// �迭b�� ��� ��Ҹ� �迭a�� �����ϱ�
	static void copy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for(int i = 0 ; i < num ; i++)
			a[i] = b[i];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a��ڼ� : ");
		int numa = sc.nextInt();
		int[] a = new int[numa];
		for(int i = 0 ; i < a.length; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("b��ڼ� : ");
		int numb = sc.nextInt();
		int[] b = new int[numb];
		for(int i = 0 ; i < b.length ; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}
		
		copy(a,b);	// �迭b�� ��� ��Ҹ� �迭 a�� �������� ����
		
		System.out.println("�迭b�� ��� ��Ҹ� �迭a�� �����߽��ϴ�.");
		for(int i = 0 ; i < numa; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		
		

	}

}
