package chap7;

//�ڹٴ� ���� ��Ӹ� �����ϴ�!! 

//���� �������� ��ӹ޾ƾ��ϴ� ��Ȳ�̶�� �������̽��� ����ų�! �տ��� �ǽ��� ���԰��踦 �̿�����!

class Tv1{
	boolean power; //�⺻�� false
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

//Ƽ��� Ƽ�� dvd ���ҵ� ������ tv! >> �׷��� tv�� ��� �ް� dvd�� ���԰���� �ξ���. 
class Tvdvd extends Tv1{ //�� ū������ ����� ���� ��Ӱ���� �ΰ� �ٸ��� ���԰���� �ּ� ����ϴ¹��!!!!
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