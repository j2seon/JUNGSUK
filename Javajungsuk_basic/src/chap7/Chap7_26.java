package chap7;

interface Repairable{}

class Units{
	int hp;
	final int max_hp;
	public Units(int hp) {
		max_hp=hp; //생성자로 해당인원의 체력을 지정할 수 있게함.
	}
}

class GroundUnit extends Units{ //지상군
	public GroundUnit(int hp) {
		super(hp);
	}
}
class AirUnit extends Units{//공군
	public AirUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable{
	public Tank() { //탱크체력
		super(150);
		hp=max_hp;
	}
	public String toString() {
		return "Tank";
	}
}
class Dropship extends GroundUnit implements Repairable{
	public Dropship() { //탱크체력
		super(125);
		hp=max_hp;
	}
	public String toString() {
		return "Dropship";
	}
}

class Marin extends GroundUnit{

	public Marin() {
		super(40);
		hp=max_hp;
	}
	public String toString() {
		return "Marin";
	}
}

class SCV extends GroundUnit implements Repairable{

	public SCV() {
		super(60);
		hp=max_hp;
	}
	void repair(Repairable r) {
		if(r instanceof Units) {
			Units u = (Units)r;
			while(u.hp!=max_hp) {
				u.hp++; 
			}
			System.out.println(u.toString()+"수리가 끝났습니다.");
			
		}
	}
	
}


public class Chap7_26 {
	public static void main(String[] args) {
		Tank t =new Tank();
		Dropship d = new Dropship();
		Marin m = new Marin();
		SCV scv = new SCV();
		scv.repair(d);
		scv.repair(t);
		//scv.repair(m); 오류 > repairable 을 구현하고 있지 않음!!!
		
	}

}
