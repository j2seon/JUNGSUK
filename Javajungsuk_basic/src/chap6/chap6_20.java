package chap6;



class Membercall {
	int iv = 10; 
	static int cv=20;
	
	int iv2=cv;
	
	//�Ұ��� sv2�� static �ε� static �� �ν��Ͻ������ ������� ���Ѵ�,
	//static sv2 =iv;
	static int sv2=new Membercall().iv; //��ü�� �����ؾ߰���
	
	static void staticMethod1() {
		System.out.println(cv); //���� static ����
		//System.out.println(iv); ������ ���� : Ŭ�����޼���ּ� �ν��Ͻ����� ��� x 
		Membercall m = new Membercall();
		System.out.println(m.iv); //��ü�� ����� �ν��Ͻ����� ���밡��
	}
	void instanceMethod () {
		System.out.println(iv);
		System.out.println(cv); //�ν��Ͻ� �޼ҵ忡���� �Ѵٻ�� ����
	}
	
	static void staticMethode2() {
		staticMethod1();
		//instanceMethod(); ����
		Membercall m = new Membercall();
		m.instanceMethod(); ; //��ü�� ������ ��밡���ϴ�.
	}
	
}




public class chap6_20 {
	public static void main(String[] args) {
		
		
		
		
		
	}

}