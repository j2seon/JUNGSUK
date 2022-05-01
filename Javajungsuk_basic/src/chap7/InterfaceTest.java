package chap7;

class A{
	public void method(I b) { //�������̽� I�� ������ Ŭ������ ���ü� �ְԵȴ�.
		b.method();
	}
}

//bŬ������ ����� ������ �и���.
interface I {
	public void method();
}


class B implements I{
	public void method() {
		System.out.println("BŬ���� �޼ҵ�");
	}
}
class C implements I{
	public void method() {
		System.out.println("CŬ���� �޼ҵ�");
	}
}

class D { //I�� �����ϰ������ʾƼ� A�� �Ű������� ������.
	public void method() {
		System.out.println("DŬ���� �޼ҵ�");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		A a =new A();
		a.method(new B()); //A�� B�� ���
		a.method(new C());
//		a.method(new D()); �Ұ��ɤ�
	}

}
