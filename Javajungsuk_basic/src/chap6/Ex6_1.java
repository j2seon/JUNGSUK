package chap6;

public class Ex6_1 {
	public static void main(String[] args) {
		MyMath math = new MyMath();

		math.printGogodan(6);

		long result1 = math.add(5,3);
		long result2 = math.substract(5, 3);
		long result3 = math.multiply(5, 3);
		long result4 = math.max(5, 3);
		long result5= math.min(5, 3);
		
 		System.out.println("add(5,3) = "+result1);
		System.out.println("substract(5, 3) = "+result2);
		System.out.println("multiply(5, 3) = "+result3);
		System.out.println("max(5,3) = "+ result4);
		System.out.println("min(5, 3) = "+result5);
	}

}

class MyMath{
	void printGogodan(int dan) {
		if(!(dan<=9 && dan>=2))
			return ; //입력받은 단이 2~9가 아니면 메서드 종료하고 나가기 ! 
		
		for(int i=1;i<=9; i++) {
			System.out.printf("%d * %d = %d%n", dan , i, dan * i);
		}
//		return;
	}
	
	long add(long a, long b) {
		long result = a+b;
		return result;
	}
	long substract(long a, long b) {return a-b;}
	long multiply(long a, long b) {return a*b;}
	long max(long a , long b) {
		if(a>b) 
			return a;
		else // else가 없으면 거짓일 때 반환 값이 없어서 오류난다
			return b;
		
	}
	long min(long a , long b) {
		long result=0;
		result= a < b ? a:b;
		return result;
		//return a < b ? a:b;
	}
	
	// 매개변수의 값이 오류가 없을지를 고민해야한다! 그에대한 대비를 한 메소드를 만드는게 중요함.
	float divide(int x ,int y ) {//0으로 나누게 되면 오류가 발생하기 때문에 그에 대한 조치 필요
		if(y==0) {
			System.out.println("0으로 나눌수 없습니다.");
			return 0;
		}
		return x/(float)y; //리턴되야하는 값이 float임
	}
	
}