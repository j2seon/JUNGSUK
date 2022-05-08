package chap15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chap15_21 {
	public static void main(String[] args) {
		
		String line = "";
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in); //콘솔에서 읽어서 
			BufferedReader br = new BufferedReader(isr);
			
			System.out.println("os 인코딩 타입 : "+ isr.getEncoding());
			
			do {
				System.out.print("문장을 입력하세요. q입력 시 종료>>");
				line=br.readLine(); //한줄씩 읽음.
				System.out.println("입력한 문장 : "+line);
			}while(!line.equalsIgnoreCase("q"));
			
			br.close();
			System.out.println("프로그램을 종료합니다.");
			
		}catch (Exception e) {
		}
		
		
		
	}

}
