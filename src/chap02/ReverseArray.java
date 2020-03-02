package chap02;

import java.util.Scanner;

public class ReverseArray {
	// �迭 ��ҿ� ���� �о� �鿩 �������� ����
	
	static void swap(int[] a, int idx1, int idx2) {
		// �迭 ��� a[idx1]�� a[idx2]�� ���� �ٲ�
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		// �迭 a�� ��Ҹ� �������� ����
		for(int i = 0 ; i < a.length / 2 ; i++) {		
			swap(a, i, a.length-i-1);	// a[i]�� a[n-i-1]�� ���� ��ȯ
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0 ; i < num ; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		reverse(x);	// �迭 a�� ��Ҹ� �������� ����
		
		System.out.println("��Ҹ� �������� �����߽��ϴ�.");
		for(int i = 0 ; i < num ; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
	}

}
