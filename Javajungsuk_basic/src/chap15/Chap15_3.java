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
			//�о�ü� �ִ� ������ũ�⸦ ��ȯ�� : available()
		try {
			while(input.available()>0) {
				input.read(tmp);//�迭�� �о ���
				output.write(tmp);//�迭�� ��.
//				System.out.println("tmp:"+Arrays.toString(tmp));
				outSrc=output.toByteArray();//������ ���� �ٸ����� : ������ �������� ����Ἥ �������� 89�� ���;��ϴµ� 4567�� ����Ἥ 8967�� �ȴ�.>>������ �ʿ� 
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
