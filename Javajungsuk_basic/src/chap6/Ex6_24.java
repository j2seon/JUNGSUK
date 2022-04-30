package chap6;

public class Ex6_24 {
	/*
	static int abs(int value) {
		return Math.abs(value);
	}
	*/
	
	//내가 Math클래스에 절대값을 구하는 함수를 알고 있어서 이렇게 풀었지만 다른방법도 있음!!!
	static int abs(int value) {
		return value>0? value:-value; //삼항연산자이용
		
	}
	
	
	public static void main(String[] args) {
		
		int value = 5;
		System.out.println(value+"의 절대값 :"+abs(value));
		value = -10;
		System.out.println(value+"의 절대값 :"+abs(value)); 
		
		
		
	}

}
