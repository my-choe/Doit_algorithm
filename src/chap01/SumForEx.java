package chap01;

import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class SumForEx {
	// n�� 7�̸� '1+2+3+4+5+6+7=28'�� ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n = sc.nextInt();
		
		int sum = 0;

		for(int i = 1; i <= n; i++) {
			if(i < n)
				System.out.print(i + " + ");
			else
				System.out.print(i + " = ");
			
			sum += i;
		}
		
		System.out.println(sum);
		

	}

}
