package chap7;


class Car_1{
	String color;
	int door;
	
	void drive() {
		System.out.println("부릉부릉");
	}
	void stop() {
		System.out.println("stop!");
	} 
}

class FireEngine extends Car_1{
	void water() { //물부리는 기능
		System.out.println("water!");
	}
} 

public class Chap7_15 {
	public static void main(String[] args) {
		
		Car_1 c = null;
		FireEngine f1 = new FireEngine();
		FireEngine f2=null;
		
		f1.water();
		c=f1; // c=(Car)f1;
//		c.water(); 불가능 
		f2=(FireEngine)c; // 다운캐스팅이라서 명시해줘야한다 ! 햇갈리면 그냥 둘다 적으면서 익숙해지자!
		f2.water();
		
		//===================================================================================
		
		Car_1 cc1= new Car_1();
		Car_1 cc2 = null;
		FireEngine ff =null;
		
//		ff=(FireEngine)cc1; //컴파일은 가능!
		
//		cc2=ff; //컴파일은 가능 but 내용이 null
//		cc2.drive();//컴파일은 가능 but 내용이 null
		
		
		
	}

}
