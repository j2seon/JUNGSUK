package chap7;

class A{
	public void method(I b) { //인터페이스 I를 구현한 클래스만 들어올수 있게된다.
		b.method();
	}
}

//b클래스의 선언과 구현을 분리함.
interface I {
	public void method();
}


class B implements I{
	public void method() {
		System.out.println("B클래스 메소드");
	}
}
class C implements I{
	public void method() {
		System.out.println("C클래스 메소드");
	}
}

class D { //I를 구현하고있지않아서 A의 매개변수로 못들어간다.
	public void method() {
		System.out.println("D클래스 메소드");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		A a =new A();
		a.method(new B()); //A가 B를 사용
		a.method(new C());
//		a.method(new D()); 불가능ㄴ
	}

}
