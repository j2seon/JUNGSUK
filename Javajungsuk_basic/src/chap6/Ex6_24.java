package chap6;

public class Ex6_24 {
	/*
	static int abs(int value) {
		return Math.abs(value);
	}
	*/
	
	//���� MathŬ������ ���밪�� ���ϴ� �Լ��� �˰� �־ �̷��� Ǯ������ �ٸ������ ����!!!
	static int abs(int value) {
		return value>0? value:-value; //���׿������̿�
		
	}
	
	
	public static void main(String[] args) {
		
		int value = 5;
		System.out.println(value+"�� ���밪 :"+abs(value));
		value = -10;
		System.out.println(value+"�� ���밪 :"+abs(value)); 
		
		
		
	}

}
