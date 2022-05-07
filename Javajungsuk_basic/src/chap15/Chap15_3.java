package chap15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Chap15_3 {
	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] tmp= new byte[4];
		

		ByteArrayInputStream input= null;
		ByteArrayOutputStream output=null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new  ByteArrayOutputStream();
		
		System.out.println("input:"+Arrays.toString(inSrc));
			//읽어올수 있는 데이터크기를 반환함 : available()
		try {
			while(input.available()>0) {
				input.read(tmp);//배열을 읽어서 담고
				output.write(tmp);//배열에 씀.
//				System.out.println("tmp:"+Arrays.toString(tmp));
				outSrc=output.toByteArray();//마지막 값이 다른이유 : 기존의 내용위에 덮어써서 마지막은 89만 나와야하는데 4567을 덮어써서 8967이 된다.>>수정이 필요 
				printArrays(tmp, outSrc);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	static void printArrays(byte[]tmp, byte[]outSrc) {

		System.out.println("tmp:"+Arrays.toString(tmp));
		System.out.println("out:"+Arrays.toString(outSrc));
		
	}

}
