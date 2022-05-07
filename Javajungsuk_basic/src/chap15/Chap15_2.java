package chap15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Chap15_2 {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] tmp= new byte[inSrc.length];
		
		
		ByteArrayInputStream input= null;
		ByteArrayOutputStream output=null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new  ByteArrayOutputStream();
		
		input.read(tmp, 0, tmp.length); // 읽어온 데이터를 tmp 배열에 담는다.
		output.write(tmp, 5, 5); //tmp의 배열에서 5부터 tmp끝까지
		
		outSrc=output.toByteArray();
		
		System.out.println("tmp:"+Arrays.toString(tmp));
		System.out.println("out:"+Arrays.toString(outSrc));
		
	}
}
