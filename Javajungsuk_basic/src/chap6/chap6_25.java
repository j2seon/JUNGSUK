package chap6;



class Car2{
	String color;
	String gear;
	int door;
	
	Car2() {
		this("red", "auto", 4); //�⺻�����ڸ� ȣ���ϸ� �ش� ������ �ʱ�ȭ�ȴ�.
		
	}
	
	Car2(String color){
		this(color, "auto", 4); //�����ٸ��� �����ϰ� �������� auto 4�� �ʱ�ȭ �ϴ� ������.
	}

	public Car2(String color, String gear, int door) {
		this.color = color;
		this.gear = gear;
		this.door = door;
	}
	
}
public class chap6_25 {

	public static void main(String[] args) {
		
	}

}