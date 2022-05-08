package chap15;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Chap15_26 {
	public static void main(String[] args) {
		int[] score = {1,100,90,80,
					   2, 80,90,70,
					   3, 70,80,50,
					   4, 70,90,80,
					   5,100,90,90,
		};
		
		try {
			RandomAccessFile raf = new RandomAccessFile("socre.dat", "rw");
			for(int i=0; i<score.length;i++) {
				raf.writeInt(score[i]);
			}
			raf.seek(0);//Ŀ���� ��ġ�� �ű�� �޼��� �ش�޼��带 �ۼ����� ������ �����Ͱ� �а� �� ������ ����
			while(true) {
				System.out.println(raf.readInt());// readInt �ÿ� �����Ͱ� ������ �������� ��ġ�ؼ�
												 //���ܰ� �߻��ع�����. ���� Ŀ���� ������ �Űܾ��Ѵ�.
			}
			
			
		}catch (EOFException ed) { //readInt()�� ȣ�������� ���̻����� �����̾��� ��� ���ܰ� �߻���.
		}catch (IOException e) {
		}
		
		
	}

}
