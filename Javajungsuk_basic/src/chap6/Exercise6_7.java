package chap6;


class Mypt{
	int x,y; //���� ��ġ

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
		// p (2,2) . �� �� �Ÿ��� ���Ѵ�
		System.out.println(p.getDistance(2,2));

	}

}