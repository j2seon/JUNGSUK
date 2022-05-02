package chap7;

public class Chap7_28 {

	public static void main(String[] args) {
		Users users = new Users();
		users.play(new C1());
		users.play(new B1());
	}

}
interface II{ 
	public abstract void play();
}

class B1 implements II{
	public void play() {
		System.out.println("B1�� ����˴ϴ�.");
	}
}
class C1 implements II{
	public void play() {
		System.out.println("C1�� ����˴ϴ�.");
	}
}

class Users{ //�������̽��� �Ű������� �ξ �� �������̽��� ������ Ŭ������ ���� �Ű������� ���� �� �ְ� �ȴ�.
	void play(II i){
		i.play();
	}
}