package chap7;

public class Chap7_29 {

	public static void main(String[] args) {
		A2 a= new A2();
		a.method();
		
	}
}

interface I2{
	public abstract void methodB();
}

class B2 implements I2{
	public void methodB() {
		System.out.println("B2�� methodB()");
	}
	public String toString() {
		return "class B2";
	}
}

class InstanceManager{
	public static I2 getinstance() {
		return new B2(); // �������̽��� ������ B2 Ŭ������ ��ȯ�Ѵ�. ����Ÿ���� �������̽���� ���� �������̽��� ������ Ŭ������ ��ȯ�Ѵٴ� ��!!!
	}
}

class A2 {
	void method(){
		I2 i = InstanceManager.getinstance();
		i.methodB();
		System.out.println(i);
	}
}
