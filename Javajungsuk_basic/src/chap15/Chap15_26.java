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
			raf.seek(0);//커서의 위치를 옮기는 메서드 해당메서드를 작성하지 않으면 포인터가 읽고 난 곳에서 멈춤
			while(true) {
				System.out.println(raf.readInt());// readInt 시에 포인터가 앞으로 마지막에 위치해서
												 //예외가 발생해버린다. 따라서 커서를 앞으로 옮겨야한다.
			}
			
			
		}catch (EOFException ed) { //readInt()로 호출했을때 더이상읽을 내용이없을 경우 예외가 발생함.
		}catch (IOException e) {
		}
		
		
	}

}
