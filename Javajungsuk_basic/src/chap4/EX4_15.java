package chap4;

import java.util.Scanner;

public class EX4_15 {
	public static void main(String[] args) {
		int answer =0, input=0; // ������ ���� ���� ���� �� ��ĳ�ʷ� ���� ���� ����
		
		answer= (int)(Math.random()*100)+1; // 1~100������ ������ ������ ����!!! (int)�� ����ȯ�ߴ�.
		Scanner scanner = new Scanner(System.in);
		//do while �� �ۿ� ���������ν� ���θ޼ҵ� ������ ���� ���� ��ü�� �ݿ��� �� �ֵ���
		//���� �ش� �������� do while�� �ۿ� ����ȴٸ� do while�� �ȿ����� ������ ������ �ȴ�.
		
		 
		do {
			System.out.print("1~100������ ������ �Է��ϼ���!!>>>> ");
			input = scanner.nextInt();
			
			if(input>answer) {
				System.out.println(input + "���� ���� ���� �Է��ϼ���!");
			}else if(input<answer) {
				System.out.println(input+"���� ū���� �Է��ϼ���!");
			}
		}while(input!=answer); //���� ���̶� ������ ���̶� ���� �������� ��� �ݺ�!
		System.out.println("�����Դϴ� ���� : "+ answer );
		
	}

}