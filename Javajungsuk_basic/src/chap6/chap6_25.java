package chap6;



class Car2{
	String color;
	String gear;
	int door;
	
	Car2() {
		this("red", "auto", 4); //기본생성자를 호출하면 해당 값으로 초기화된다.
		
	}
	
	Car2(String color){
		this(color, "auto", 4); //색만다르게 지정하고 나머지는 auto 4로 초기화 하는 생성자.
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
