package chap7;

interface Fighterable extends Attackable,Movable{} //�������̽��� ���߻���� �����ϴ�!!!

interface Movable{
	void move(int x, int y); //public abstract �� �����Ȱ�.
}

interface Attackable{
	void attck(Unit1 u);//public abstract �� �����Ȱ�.
}

class Unit1{
	int Hp;	//ü��
	int x,y; //��ǥ
}

class Fighter1 extends Unit1 implements Fighterable{ //figther�� unit �̴� >> ��� / �����̰� �����Ҽ��ִ� >> ����
	public void attck(Unit1 u) {}
	public void move(int x, int y) { } //public !!!
}



public class Chap7_24 {
	public static void main(String[] args) {
		Fighter1 f1 = new Fighter1();
		
		if(f1 instanceof Unit1) 
			System.out.println("f1�� Unit1�� �ڼ��Դϴ�.");
		
		if(f1 instanceof Fighterable)
			System.out.println("f1�� Fighterable�� �����߽��ϴ�.");
		
		if(f1 instanceof Movable)
			System.out.println("f1�� Movable�� �����߽��ϴ�.");
		
		if(f1 instanceof Attackable)
			System.out.println("f1�� Attackable�� �����߽��ϴ�.");

	}
}
