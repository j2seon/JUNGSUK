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
		return"("+x+","+y+")"; //x와 y를 문자열로
	}
}
class shape{//도형
	String color="black";
	void draw() {
		System.out.printf("[color=%s]%n",color);
	}	
}

class Circle extends shape{// 원은 도형이다 ==> 상속관계로
	Point p; //좌표 //== > 원은 점이다 ? 이상함 근데 점이 있긴해 >>포함관계
	int r; //반지름
	
	public Circle() {
		this(new Point(0, 0), 100); //기본생성자를 호출하면 좌표가 0,0 이고 반지금이 100 인 원이 새로만들어진다.
	}
	public Circle(Point p, int r) {
		this.p = p;
		this.r = r;
	}
	void draw() {
		System.out.printf("[center=(%d,%d)], r=%d, color=%s%n",p.x,p.y,r,color);
	}
}

class Triangle extends shape{ //삼각형은 도형이다 >>상속관계
	Point[] p=new Point[3]; //3개좌표를 받을 것! //삼각형은 점이다 이상해서 포함관계
	
	Triangle(Point[] p) {
		this.p=p;
	}
	
	void draw() {
		System.out.printf("[p1=%s , p2=%s, p3=%s , color=%s]%n",p[0].getXY(),p[1].getXY(),p[2].getXY(),color);
	}
}


public class Chap7_2 {
	public static void main(String[] args) {
		//배열만듬! point들의 집합체
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
