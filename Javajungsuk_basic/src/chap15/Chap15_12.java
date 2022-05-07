package chap15;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Chap15_12 {
	public static void main(String[] args) {
		
		int sum=0;
		int score=0;
		
		
		FileInputStream fis=null;
		DataInputStream dis =null;
		
		
		try {
			fis = new FileInputStream("score.dat");
			dis = new DataInputStream(fis);
			
			while(true) {
				score=dis.readInt();
				System.out.println(score);
				sum+=score;
			}
		} catch (EOFException e) {//DataInputStream은 읽을 데이터값이 없으면 해당 예외를 발생시킴! //무한반복문으로 설정했기때문에 값없으면 예외발생함.
			System.out.println("점수의 총합은 "+sum);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				dis.close(); // while문이 닫히고 close해야하는데 무한 반복문이라서 finally에서 처리!!
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//try with resources문 으로 하면 close가 필요없다.
		
		
		
	}

}
