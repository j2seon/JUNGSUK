package chap7;

class Point1 extends Object { 
	int x;
	int y;
}

//class Circle extends Point{ //상속관계
//	int r;
//}

class Circle1 extends Object{ //포함관계
	//Point p = new Point(); //처음에 기본적으로 만들어주던가!
	int r;
	Point p; //선언만하고
	Circle1() { //생성자로 초기화를 해주던가
		p = new Point();
	}
	
}

public class Ex7_4 {

	public static void main(String[] args) {
		Circle1 c = new Circle1();
		System.out.println(c);
		System.out.println(c.toString());
		
		Circle1 c2 = new Circle1();
		System.out.println(c2);
		System.out.println(c2.toString());
		
	}

}
