package chap7;

//자바는 단일 상속만 가능하다!! 

//만약 여러개를 상속받아야하는 상황이라면 인터페이스를 만들거나! 앞에서 실습한 포함관계를 이용하자!

class Tv1{
	boolean power; //기본값 false
	int channel;
	
	void power() {
		power = !power; //true
	}
	void channelUp() {
		++channel;
	}
	void channelDown(){
		--channel;
	}
}

class Dvd{
	boolean power;
	void power() {
		power = !power; //true
	}
	void play() {}
	void stop() {}
}

//티비긴 티빈데 dvd 역할도 가능한 tv! >> 그래서 tv를 상속 받고 dvd를 포함관계로 두었다. 
class Tvdvd extends Tv1{ //더 큰범위로 사용할 것을 상속관계로 두고 다른건 포함관계로 둬서 사용하는방법!!!!
	Dvd d= new Dvd();
	void play(){
		d.play();
	}
	void power() {
		d.power();
	}
	void stop() {
		d.stop();
	}
	
}

public class Chap7_2_1 {

	public static void main(String[] args) {
		
	}
	
	
	
	
}
