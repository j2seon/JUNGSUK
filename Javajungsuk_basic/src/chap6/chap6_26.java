package chap6;


class Car3{
	String color;
	String gear;
	int door;
	
	Car3() {
		this("red", "auto", 4); //기본생성자를 호출하면 해당 값으로 초기화된다.
		
	}

	public Car3(String color, String gear, int door) {
		this.color = color;
		this.gear = gear;
		this.door = door;
	}
	
	Car3(Car3 c){ //생성자 복사를 위한 생성자를 만듬! 
		this(c.color, c.gear, c.door);
		
		/* 위의 내용을 해당 내용이랑 동일 
		color=c.color;
		gear=c.gear;
		door=c.door;
		*/
	}
	
}
public class chap6_26 {

	public static void main(String[] args) {
		Car3 c= new Car3(); //"red", "auto", 4로 초기화 되는 c 호출
		
		Car3 c1 = new Car3(c); //c의 값을 복사한 c1를 생성.
		
		//둘의 값을 꺼내보면 똑같다!!!
		System.out.println("c : "+c.color+","+c.gear+","+c.door);
		System.out.println("c1 : "+c1.color+","+c1.gear+","+c1.door);
		
		//여기서 c1의 값을 변경해주면?
		c1.color="white";
		System.out.println("c : "+c.color+","+c.gear+","+c.door);
		System.out.println("c1 : "+c1.color+","+c1.gear+","+c1.door);
		//c1의 값이 달라진걸 확인할 수 있다. >> 즉  Car3(Car3 c)의 생성자로 호출된 생성자는 독립적으로 존재하는 인스턴스라는 것! 
		
		
		
		
		
	}

}
