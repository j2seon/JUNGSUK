package chap15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Chap15_4 {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] tmp= new byte[4];
		

		ByteArrayInputStream input= null;
		ByteArrayOutputStream output=null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new  ByteArrayOutputStream();
		
		try {
			while(input.available()>0) { 
					int leng = input.read(tmp);//읽어온 데이터의 수를 담고
					output.write(tmp, 0, leng); //0부터 읽은 데이터 수까지 출력!
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
		outSrc = output.toByteArray();
			
		
		
		
		System.out.println("input:"+Arrays.toString(inSrc));
		System.out.println("tmp:"+Arrays.toString(tmp));
		System.out.println("out:"+Arrays.toString(outSrc));
	}

}
