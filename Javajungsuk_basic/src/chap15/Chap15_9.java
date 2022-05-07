package chap15;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Arrays;

public class Chap15_9 {

	public static void main(String[] args) {
		
		
		ByteArrayOutputStream bos =null;
		DataOutputStream dos =null;
		
		byte[] result =null;
		try {
			bos = new ByteArrayOutputStream();
			dos = new DataOutputStream(bos);
			dos.writeInt(10);
			dos.writeFloat(20.0f);
			dos.writeBoolean(true);
			
			result = bos.toByteArray();  //result에 위에서 output 한 배열을 담는다.
			
			String[] hex = new String[result.length]; 
			
			for(int i=0; i<result.length; i++) {
				if(result[i]<0) {
					hex[i]=String.format("%02x", result[i]+256);
				}else {
					hex[i]=String.format("%02x", result[i]);
				}
			}
			
			System.out.println("10진수 : "+Arrays.toString(result));
			System.out.println("16진수 : "+Arrays.toString(hex));

			dos.close();
		
		}catch (Exception e) {
		}
		
	
	
	
	}

}
