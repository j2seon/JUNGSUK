package chap7;


class AAA{
	int i =100;
	BBB b =new BBB();
	
	class BBB{ //BBB�� AAA�� ����Ŭ����  >> CCC���� �������� ����. 
		void method() {
//			AAA a = new AAA();
//			System.out.println(a.i);
			System.out.println(i); //i�� �ٷ� ȣ���� �����ϴ�!!!
		}
	} 
}

/*
class BBB{ 
	void method() {
		AAA a = new AAA();
		System.out.println(a.i);
	}
} BBB���� A�� �ν��Ͻ��� ����Ϸ��� �ش���ó���ؾ��Ѵ�. >> �ٸ������? ����Ŭ������ ����°�.
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