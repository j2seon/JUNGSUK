package chap15;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Chap15_6 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(args[0]);
			FileOutputStream fos = new FileOutputStream(args[1]);
			
			int data=0;
			while((data=fis.read())!=-1) {
				fos.write(data);
			}
			fis.close();
			fos.close();
		
		}catch (Exception e) {
	
		}
		
		
		
		
	}

}