package chap02;

import java.util.Scanner;

public class Rcopy {
	// �迭 b�� ��� ��Ҹ� �迭 a�� �������� ����
		static void rcopy(int[] a, int[] b) {
			int num = a.length <= b.length ? a.length : b.length;
			for (int i = 0; i < num; i++)
				a[i] = b[b.length - i - 1];
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.print("a�� ��ڼ��� ��");
			int numa = sc.nextInt(); // ��ڼ�
			int[] a = new int[numa]; // ��ڼ� numa�� �迭
			for (int i = 0; i < numa; i++) {
				System.out.print("a[" + i + "] : ");
				a[i] = sc.nextInt();
			}

			System.out.print("b�� ��ڼ��� ��");
			int numb = sc.nextInt(); // ��ڼ�
			int[] b = new int[numb]; // ��ڼ� numb�� �迭
			for (int i = 0; i < numb; i++) {
				System.out.print("b[" + i + "] : ");
				b[i] = sc.nextInt();
			}

			rcopy(a, b); // �迭 b�� ��� ��Ҹ� �迭 a�� �������� copy

			System.out.println("�迭 b�� ��� ��Ҹ� �迭 a�� �������� �����߽��ϴ�.");
			for (int i = 0; i < numa; i++)
				System.out.println("a[" + i + "] = " + a[i]);
		}
	}
