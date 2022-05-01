package chap7;

public class Chap7_18 {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x = "+ p.x);
		p.method();
		
		System.out.println("c.x = "+c.x);
		c.method();
		
		//타입은 다르지만 인스턴스가 Child!!! 같은 인스턴스를 참고해서 method는 오버라이딩 되어있지만 ㅊ인스턴스변수는 해당 타입의 변수의 값이 나온다.
		
		Parent p1 = new Child1();
		Child1 c1 = new Child1();
		
		System.out.println("p1.x = "+ p1.x);
		p1.method();
		System.out.println("c1.x = "+ c1.x);
		c1.method();
	}
}
class Parent{
	int x =100;
	
	void method() {
		System.out.println("Parent Method");
	}
}
class Child extends Parent{
	int x = 200;
	void method() {
		System.out.println("Child Method");
		System.out.println("super.x = "+ super.x); //상위 클래스의 인스턴스변수를 호출하기 위해서 super 를 사용함!
	}
}

class Child1 extends Parent{}