package chap7;
//인터페이스 다형성!!

//추상메소드 
abstract class Unit{
	int x,y;
	abstract void move(int x, int y );
	void stop() {System.out.println("멈춥니다.");}
}

//인터페이스 : 추상메소드와 같은 메서드가 있어도 몸통이 구현되어있지 않기때문에 작성가능!!
interface Fightable {
	void move(int x, int y); //public abstract가 생략되었다.
	void attack(Fightable f); //public abstract가 생략되었다.
}

//추상메소드를 상속하고 인터페이스를 구현하는 클래스 만들기
class Figher extends Unit implements Fightable{
	
	//public이 있어야하는 이유 : 오버라이딩 시 조상보다 접근제어자가 같거나 넓어야되서!!! (좁으면 안된다.)
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]"+"로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격합니다.");
	}
	
	//싸울수 있는 상대를 불러온다.
	Fightable getFightable() {
		Figher f = new Figher(); //Fighter를 생성해서 반환.
		//Fightable f= new Figher(); 도 가능! 그러면 return에 굳이 형변환 필요 없이 내보내는것.
		return f; //(Fightable)f랑 같은의미이고 
	}
	
}


public class Chap7_25_1 {
	public static void main(String[] args) {
		Figher f = new Figher();
		f.move(100, 200);
		f.attack(new Figher()); 
		
		Fightable f2 = f.getFightable(); //getFightable에 리턴된 타입이 Fightable 이여서!!
		
		/*
		 * 위의 문장은 
		 * Figher f2 = new Figher();
		 * f.attack(f2); 와 같은 것!!
		 * */
		
		Unit u = new Figher();
		u.move(100, 200); // 가능! 
//		u.attack(new Figher()); 불가능! unit에는 attack이 없다.
		
		Fightable ff = new Figher(); //인터페이스로는 가능
		ff.move(100, 200);
		ff.attack(new Figher());
//		ff.stop() 인터페이스에 stop메소드가 없기때문에 불가능
		
		
		
		
	}

}
