package chap01;

import java.util.Scanner;

public class SumOf {
	// ����a,b�����Ͽ� �� ������ ��� ������ ���� ���Ͽ� ��ȯ�ϴ� �޼��� �ۼ�
	
	static int sumof(int a, int b) {
		int min;
		int max;
		
		if(a > b) {
			max = a;
			min = b;
		}else {
			max = b;
			min = a;
		}
		
		int sum = 0;
		
		for(int i = min ; min <= max ; min++)
			sum += i;
		
		return (sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� a���� b������ ���� ���մϴ�.");
		
		System.out.print("a�� �� : ");
		int a = sc.nextInt();
		
		System.out.print("b�� �� : ");
		int b = sc.nextInt();
		
		System.out.println(a + "���� " + b + "������ ���� " + sumof(a,b) + "�Դϴ�.");
	}

}
