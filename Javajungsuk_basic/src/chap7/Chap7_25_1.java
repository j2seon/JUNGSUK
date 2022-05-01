package chap7;
//�������̽� ������!!

//�߻�޼ҵ� 
abstract class Unit{
	int x,y;
	abstract void move(int x, int y );
	void stop() {System.out.println("����ϴ�.");}
}

//�������̽� : �߻�޼ҵ�� ���� �޼��尡 �־ ������ �����Ǿ����� �ʱ⶧���� �ۼ�����!!
interface Fightable {
	void move(int x, int y); //public abstract�� �����Ǿ���.
	void attack(Fightable f); //public abstract�� �����Ǿ���.
}

//�߻�޼ҵ带 ����ϰ� �������̽��� �����ϴ� Ŭ���� �����
class Figher extends Unit implements Fightable{
	
	//public�� �־���ϴ� ���� : �������̵� �� ���󺸴� ���������ڰ� ���ų� �о�ߵǼ�!!! (������ �ȵȴ�.)
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]"+"�� �̵�");
	}
	public void attack(Fightable f) {
		System.out.println(f+"�� �����մϴ�.");
	}
	
	//�ο�� �ִ� ��븦 �ҷ��´�.
	Fightable getFightable() {
		Figher f = new Figher(); //Fighter�� �����ؼ� ��ȯ.
		//Fightable f= new Figher(); �� ����! �׷��� return�� ���� ����ȯ �ʿ� ���� �������°�.
		return f; //(Fightable)f�� �����ǹ��̰� 
	}
	
}


public class Chap7_25_1 {
	public static void main(String[] args) {
		Figher f = new Figher();
		f.move(100, 200);
		f.attack(new Figher()); 
		
		Fightable f2 = f.getFightable(); //getFightable�� ���ϵ� Ÿ���� Fightable �̿���!!
		
		/*
		 * ���� ������ 
		 * Figher f2 = new Figher();
		 * f.attack(f2); �� ���� ��!!
		 * */
		
		Unit u = new Figher();
		u.move(100, 200); // ����! 
//		u.attack(new Figher()); �Ұ���! unit���� attack�� ����.
		
		Fightable ff = new Figher(); //�������̽��δ� ����
		ff.move(100, 200);
		ff.attack(new Figher());
//		ff.stop() �������̽��� stop�޼ҵ尡 ���⶧���� �Ұ���
		
		
		
		
	}

}
