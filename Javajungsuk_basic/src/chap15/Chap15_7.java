package chap15;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Chap15_7 {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5); //버퍼크기는 5개!
			
			for(int i=0; i<='9';i++) {
				
				bos.write(i);
			}
			//bos.flush();  //flush 가 없어서 전부출력되지 않는다. 버퍼에 남은상태로 종료됨
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
