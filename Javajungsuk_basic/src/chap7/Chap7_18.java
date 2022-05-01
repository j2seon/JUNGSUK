package chap7;

public class Chap7_18 {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x = "+ p.x);
		p.method();
		
		System.out.println("c.x = "+c.x);
		c.method();
		
		//Ÿ���� �ٸ����� �ν��Ͻ��� Child!!! ���� �ν��Ͻ��� �����ؼ� method�� �������̵� �Ǿ������� ���ν��Ͻ������� �ش� Ÿ���� ������ ���� ���´�.
		
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
		System.out.println("super.x = "+ super.x); //���� Ŭ������ �ν��Ͻ������� ȣ���ϱ� ���ؼ� super �� �����!
	}
}

class Child1 extends Parent{}