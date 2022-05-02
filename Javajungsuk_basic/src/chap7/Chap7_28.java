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
		System.out.println("B1이 실행됩니다.");
	}
}
class C1 implements II{
	public void play() {
		System.out.println("C1이 실행됩니다.");
	}
}

class Users{ //인터페이스를 매개변수로 두어서 그 인터페이스를 구현한 클래스가 전부 매개변수로 들어올 수 있게 된다.
	void play(II i){
		i.play();
	}
}