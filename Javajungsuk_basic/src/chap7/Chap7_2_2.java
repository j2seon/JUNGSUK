package chap7;

class Point1 extends Object { 
	int x;
	int y;
}

//class Circle extends Point{ //��Ӱ���
//	int r;
//}

class Circle1 extends Object{ //���԰���
	//Point p = new Point(); //ó���� �⺻������ ������ִ���!
	int r;
	Point p; //�����ϰ�
	Circle1() { //�����ڷ� �ʱ�ȭ�� ���ִ���
		p = new Point();
	}
	
}

public class Chap7_2_2 {

	public static void main(String[] args) {
		Circle1 c = new Circle1();
		System.out.println(c);
		System.out.println(c.toString());
		
		Circle1 c2 = new Circle1();
		System.out.println(c2);
		System.out.println(c2.toString());
		
	}

}