package chap7;


class Point { 
	int x;
	int y;
}

//class Circle extends Point{ //��Ӱ���
//	int r;
//}

class Circle { //���԰���
	//Point p = new Point(); //ó���� �⺻������ ������ִ���!
	int r;
	Point p; //�����ϰ�
	Circle() { //�����ڷ� �ʱ�ȭ�� ���ִ���
		p = new Point();
	}
	
}

public class Ex7_2 {
	public static void main(String[] args) {
		Circle c = new Circle();
//		c.x=1;
//		c.y=2;
//		c.r=3;
	
//		System.out.println("c.x = "+ c.x);
//		System.out.println("c.y = "+c.y);
//		System.out.println("c.r = "+ c.r);
		
		c.p.x=1;
		c.p.y=2;
		c.r=3;
		
		System.out.println("c.p.x = "+c.p.x);
		System.out.println("c.p.y = "+c.p.y);
		System.out.println("c.r = "+c.r);
		
		
	}

}
