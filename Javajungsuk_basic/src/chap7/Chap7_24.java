package chap7;

interface Fighterable extends Attackable,Movable{} //인터페이스는 다중상속이 가능하다!!!

interface Movable{
	void move(int x, int y); //public abstract 가 생략된것.
}

interface Attackable{
	void attck(Unit1 u);//public abstract 가 생략된것.
}

class Unit1{
	int Hp;	//체력
	int x,y; //좌표
}

class Fighter1 extends Unit1 implements Fighterable{ //figther은 unit 이다 >> 상속 / 움직이고 공격할수있다 >> 구현
	public void attck(Unit1 u) {}
	public void move(int x, int y) { } //public !!!
}



public class Chap7_24 {
	public static void main(String[] args) {
		Fighter1 f1 = new Fighter1();
		
		if(f1 instanceof Unit1) 
			System.out.println("f1은 Unit1의 자손입니다.");
		
		if(f1 instanceof Fighterable)
			System.out.println("f1은 Fighterable을 구현했습니다.");
		
		if(f1 instanceof Movable)
			System.out.println("f1은 Movable을 구현했습니다.");
		
		if(f1 instanceof Attackable)
			System.out.println("f1은 Attackable을 구현했습니다.");

	}
}
