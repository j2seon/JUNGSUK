package chap7;

class Point{
	int x, y;
	
	public Point() {
		this(0, 0);
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	String getXY() {
		return"("+x+","+y+")"; //x�� y�� ���ڿ���
	}
}
class shape{//����
	String color="black";
	void draw() {
		System.out.printf("[color=%s]%n",color);
	}	
}

class Circle extends shape{// ���� �����̴� ==> ��Ӱ����
	Point p; //��ǥ //== > ���� ���̴� ? �̻��� �ٵ� ���� �ֱ��� >>���԰���
	int r; //������
	
	public Circle() {
		this(new Point(0, 0), 100); //�⺻�����ڸ� ȣ���ϸ� ��ǥ�� 0,0 �̰� �������� 100 �� ���� ���θ��������.
	}
	public Circle(Point p, int r) {
		this.p = p;
		this.r = r;
	}
	void draw() {
		System.out.printf("[center=(%d,%d)], r=%d, color=%s%n",p.x,p.y,r,color);
	}
}

class Triangle extends shape{ //�ﰢ���� �����̴� >>��Ӱ���
	Point[] p=new Point[3]; //3����ǥ�� ���� ��! //�ﰢ���� ���̴� �̻��ؼ� ���԰���
	
	Triangle(Point[] p) {
		this.p=p;
	}
	
	void draw() {
		System.out.printf("[p1=%s , p2=%s, p3=%s , color=%s]%n",p[0].getXY(),p[1].getXY(),p[2].getXY(),color);
	}
}


public class Chap7_2 {
	public static void main(String[] args) {
		//�迭����! point���� ����ü
		Point[] p= {new Point(100, 100),
					new Point(200, 100),
					new Point(120, 110)
					};
		
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(120, 120), 50);
		Circle c1 = new Circle();
		t.draw();
		c.draw();
		c1.draw();
		
	}

}