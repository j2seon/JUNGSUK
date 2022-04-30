package chap6;

public class Ex6_11 {
	public static void main(String[] args) {
		int x[] = {10}; //크기가 1일 배열이 만들어짐 
		//x는 크기가 1인 배열을 쳐다보게됨!>주소
		System.out.println("main() : "+x[0] );
		
		
		//메소드 호출 되고 그매소드에는 크기가 1일 배열을 바라보고있는 x의 주소가들어감 
		change(x);
		System.out.println("after change(x) ");
		//x가 가르키는 배열의 값을 바꿨음.
		System.out.println("main() : "+ x[0]);
	}
	
	
	static void change(int[] x) {
		x[0]=1000; //받은 주소값의 x[0]의 값을 바꿈
		System.out.println("change() : "+x[0]);
		
	}
}
