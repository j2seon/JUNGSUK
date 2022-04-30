package chap7;


//생성사의 첫줄에 반드시 생성자를!! 
//기본생성자를 적는 것을 필수로하자  모든 생성자는 첫줄에 다른생성자를 호출한다.


class MyPoint1{
	int x; 
	int y;
	
	MyPoint1() {}
	
	MyPoint1(int x, int y){
		this.x=x;
		this.y=y;
	}
	String getLocation() {
		return "x : "+x+", y : "+y;
	}
}
class Point3d extends MyPoint1{
	int z;
	
	Point3d(int x , int y ,int z) {
		super(x,y); //조상의 멤버는 조상이 초기화하도록 하는 것이 좋다.
	//	super();
	//	this.x=x;
	//	this.y=y;
		this.z=z;
	}
	
}


public class Ex7_11 {
	public static void main(String[] args) {

	}

}
