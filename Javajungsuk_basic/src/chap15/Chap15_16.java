package chap15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class Chap15_16 {
	public static void main(String[] args) {
		try {
			File file =new File("J:/temp/test.txt");
			FileInputStream fis = new FileInputStream(file);
			FileReader fr = new FileReader(file);
			
			//FileInputStream�� �̿��ؼ� �о��
			int data=0;
			
			while((data=fis.read())!=-1) {// FileInputStream�� ��� ������
				System.out.print((char)data);
			}
			System.out.println();
			fis.close();
			
			while((data=fr.read())!=-1) {
				System.out.print((char)data);
			}
			fr.close();
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
