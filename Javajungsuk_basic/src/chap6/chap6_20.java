package chap6;



class Membercall {
	int iv = 10; 
	static int cv=20;
	
	int iv2=cv;
	
	//불가능 sv2는 static 인데 static 은 인스턴스멤버를 사용하지 못한다,
	//static sv2 =iv;
	static int sv2=new Membercall().iv; //객체를 생성해야가능
	
	static void staticMethod1() {
		System.out.println(cv); //같은 static 가능
		//System.out.println(iv); 에러가 난다 : 클래스메서드애서 인스턴스변수 사용 x 
		Membercall m = new Membercall();
		System.out.println(m.iv); //객체를 만들면 인스턴스변수 가용가능
	}
	void instanceMethod () {
		System.out.println(iv);
		System.out.println(cv); //인스턴스 메소드에서는 둘다사용 가능
	}
	
	static void staticMethode2() {
		staticMethod1();
		//instanceMethod(); 에러
		Membercall m = new Membercall();
		m.instanceMethod(); ; //객체를 만들어야 사용가능하다.
	}
	
}




public class chap6_20 {
	public static void main(String[] args) {
		
		
		
		
		
	}

}
