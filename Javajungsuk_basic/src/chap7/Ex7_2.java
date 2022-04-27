package chap7;


class Point { 
	int x;
	int y;
}

//class Circle extends Point{ //상속관계
//	int r;
//}

class Circle { //포함관계
	//Point p = new Point(); //처음에 기본적으로 만들어주던가!
	int r;
	Point p; //선언만하고
	Circle() { //생성자로 초기화를 해주던가
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
