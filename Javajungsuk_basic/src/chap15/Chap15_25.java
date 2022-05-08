package chap15;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Chap15_25 {
	public static void main(String[] args) {
		
		//RandomAccessFile�� �б�� ���Ⱑ ���ÿ� �ǰ� datainput/output�� �����߱� ������ �ش�޼ҵ带 ����� �� �ִ�.
		try {
			RandomAccessFile raf = new RandomAccessFile("test.dat", "rw");
			System.out.println("���� ������ ��ġ : "+ raf.getFilePointer());
			raf.writeInt(100);
			System.out.println("���� ������ ��ġ : "+ raf.getFilePointer());//int�� 4 byte����
			raf.writeLong(100l);
			System.out.println("���� ������ ��ġ : "+ raf.getFilePointer());//long�� 8byte����

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
		
	}

}
