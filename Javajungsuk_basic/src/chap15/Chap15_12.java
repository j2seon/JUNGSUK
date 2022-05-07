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
		} catch (EOFException e) {//DataInputStream�� ���� �����Ͱ��� ������ �ش� ���ܸ� �߻���Ŵ! //���ѹݺ������� �����߱⶧���� �������� ���ܹ߻���.
			System.out.println("������ ������ "+sum);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				dis.close(); // while���� ������ close�ؾ��ϴµ� ���� �ݺ����̶� finally���� ó��!!
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//try with resources�� ���� �ϸ� close�� �ʿ����.
		
		
		
	}

}
