package chap15;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Chap15_7 {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5); //����ũ��� 5��!
			
			for(int i=0; i<='9';i++) {
				
				bos.write(i);
			}
			//bos.flush();  //flush �� ��� ������µ��� �ʴ´�. ���ۿ� �������·� �����
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
