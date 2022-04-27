package chap7;

class MyPoint extends Object{
	int x; 
	int y;
	
	public MyPoint(int x, int y) {
		this.x=x;
		this.y=y;
	}
//	String getLocation() {
//		return "x:"+x+", y:"+y;
//	}
	@Override
	//Object 클래스의 toString()을 오버라이딩
	public String toString() {
		return "x:"+x+", y:"+y;
	}
	
	
	
	
}

//class MyPoint3D extends MyPoint{
//	int z;
//	
//	//조상의 getLocation을 오버라이딩한다.
//	String getLocation() {
//		return "x:"+x+", y:"+y+", z:"+z;
//	}
//}


public class Ex7_5 {
	public static void main(String[] args) {
//		MyPoint3D p = new MyPoint3D();
//		p.x=3;
//		p.y=5;
//		p.z=7;
//		System.out.println(p.getLocation());
		
		MyPoint p = new MyPoint(3,5);
//		p.x=3;
//		p.y=5;// 이렇게 말고 생성자로 보내면 더 깔끔!
		System.out.println(p.toString()); // 위의 오버라이딩 한 값이 나온다.
	 	System.out.println(p); //더 간단히 
	}

}
