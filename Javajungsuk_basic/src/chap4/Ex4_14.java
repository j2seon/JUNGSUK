package chap4;

import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		int num =0, sum=0; //���� ���� ���� �հ� ���� ��������
		System.out.println("���ڸ� �Է��ؿ�! >>");
		Scanner scanner = new Scanner(System.in);
		num=scanner.nextInt();
		
		while(num!=0) {
			sum+=num%10; // 10���� ������ �� ���� �������� ���� ����
			System.out.println("sum : "+ sum +" num : "+num);
			
			num=num/10; // ������ ���ϰ� 10���� ����
		}
		System.out.println("��ü �ڸ����� �� : "+ sum);
		
		System.out.println();
		
		//while ���� for������!
		for(num=1234; num>0; num=num/10) {
			System.out.println(num);
		} 
		
		
		
	}

}