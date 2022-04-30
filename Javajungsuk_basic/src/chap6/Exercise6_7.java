package chap6;


class Mypt{
	int x,y; //점의 위치

	public Mypt(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x , int y) {
		return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
	}
}

public class Exercise6_7 {

	public static void main(String[] args) {
		Mypt p = new Mypt(1,1);
		// p (2,2) . 와 의 거리를 구한다
		System.out.println(p.getDistance(2,2));

	}

}
