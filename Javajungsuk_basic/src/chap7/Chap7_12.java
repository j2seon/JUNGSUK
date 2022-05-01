package chap7;

class Card3{
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height= 100;
	
	//생성자에서 인스턴스 final을 초기화 하는 방법 >> 각 인스턴스를 만들때마다 final 변수가 다른값이 될 수 있다.
	Card3(String kind , int num){
		KIND=kind;
		NUMBER=num;
	}
	Card3(){
		this("SPADE", 1);
	}
	public String toString() {
		return KIND+" "+NUMBER;
	}
	
}


public class Chap7_12 {
	public static void main(String[] args) {
		Card3 c = new Card3("HREAT", 10);
		//c.NUMBER=9; 변경불가능 !!!!생성자로 해당 값을 지정해주었다
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
		
		Card3 c1 = new Card3();
		System.out.println(c1.KIND);
//		c.NUMBER=3; //불가능
		System.out.println(c1.NUMBER);
		
		
	}

}
