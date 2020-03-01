package chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand2 {
	// �迭 ��� �ִ� ���ϱ�(���� �� ����)
	
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
		
		System.out.println("Ű�� �ִ��� ���մϴ�.");
		int num = 1 + rand.nextInt(10);
		
		int[] height = new int[num];
		System.out.println("��� �� : " + num + "��");
		System.out.println("Ű ���� �Ʒ��� �����ϴ�.");
		
		for(int i = 0 ; i < height.length ; i++) {
			height[i] = 100 + rand.nextInt(90);		// 100 + (0~89) >>> Ű �� : 100~189
			System.out.println("height[" + i + "] : " + height[i]);
		}
		
		System.out.println("�ִ��� " + maxOf(height) + " �Դϴ�.");
	}

}
