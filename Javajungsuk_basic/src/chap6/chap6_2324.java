package chap6;


class TData1{
	int value;
}

class TData2{
	int value;
	TData2(int x ){
		value=x;
	}
}

class Car1{
	String color;
	String gear;
	int door;
	
	Car1() {}

	public Car1(String c, String g, int d) {
		color = c;
		gear = g;
		door = d;
	}
	
	
	
}
public class chap6_2324 {
	public static void main(String[] args) {
		TData1 d = new TData1();
		//TData2 dd= new TData2(); 오류가 난다 기본생성자는 매개변수를 가진 생성자를 만들게뫼면 자동 생성되지 않기때문에
		
		
		//매개변수가 있는 생성자를 사용하게되면 코드가 간결해진다. 
		Car1 c =new Car1();
		c.color="white";
		c.door=2;
		c.gear="auto";
		
		Car1 c1 =new Car1("white", "auto", 2);
		//결과값은 동일 
		System.out.println(c.color+c.gear+c.door);
		System.out.println(c1.color+c1.gear+c.door);
			
				
		
	}
}
