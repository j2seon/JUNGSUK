package chap7;

class Card3{
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height= 100;
	
	//�����ڿ��� �ν��Ͻ� final�� �ʱ�ȭ �ϴ� ��� >> �� �ν��Ͻ��� ���鶧���� final ������ �ٸ����� �� �� �ִ�.
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
		//c.NUMBER=9; ����Ұ��� !!!!�����ڷ� �ش� ���� �������־���
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
		
		Card3 c1 = new Card3();
		System.out.println(c1.KIND);
//		c.NUMBER=3; //�Ұ���
		System.out.println(c1.NUMBER);
		
		
	}

}