package chap7;


class AAA{
	int i =100;
	BBB b =new BBB();
	
	class BBB{ //BBB는 AAA의 내부클래스  >> CCC에서 접근하지 못함. 
		void method() {
//			AAA a = new AAA();
//			System.out.println(a.i);
			System.out.println(i); //i를 바로 호출이 가능하다!!!
		}
	} 
}

/*
class BBB{ 
	void method() {
		AAA a = new AAA();
		System.out.println(a.i);
	}
} BBB에서 A의 인스턴스를 사용하려면 해당방법처럼해야한다. >> 다른방법은? 내부클래스로 만드는것.
*/
//class CCC{
//	BBB b = new BBB();
//}





public class InnerTest {

	public static void main(String[] args) {

//		BBB b = new BBB();
//		b.method();

		
	}

}
