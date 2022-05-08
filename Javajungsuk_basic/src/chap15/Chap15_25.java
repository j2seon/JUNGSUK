package chap15;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Chap15_25 {
	public static void main(String[] args) {
		
		//RandomAccessFile은 읽기와 쓰기가 동시에 되고 datainput/output을 구현했기 때문에 해당메소드를 사용할 수 있다.
		try {
			RandomAccessFile raf = new RandomAccessFile("test.dat", "rw");
			System.out.println("파일 포인터 위치 : "+ raf.getFilePointer());
			raf.writeInt(100);
			System.out.println("파일 포인터 위치 : "+ raf.getFilePointer());//int가 4 byte여서
			raf.writeLong(100l);
			System.out.println("파일 포인터 위치 : "+ raf.getFilePointer());//long이 8byte여서

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
		
	}

}
