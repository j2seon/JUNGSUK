package chap15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chap15_21 {
	public static void main(String[] args) {
		
		String line = "";
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in); //�ֿܼ��� �о 
			BufferedReader br = new BufferedReader(isr);
			
			System.out.println("os ���ڵ� Ÿ�� : "+ isr.getEncoding());
			
			do {
				System.out.print("������ �Է��ϼ���. q�Է� �� ����>>");
				line=br.readLine(); //���پ� ����.
				System.out.println("�Է��� ���� : "+line);
			}while(!line.equalsIgnoreCase("q"));
			
			br.close();
			System.out.println("���α׷��� �����մϴ�.");
			
		}catch (Exception e) {
		}
		
		
		
	}

}
