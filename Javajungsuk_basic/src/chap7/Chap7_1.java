package chap7;

class Tv{
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

class SmartTv extends Tv{
	boolean caption;
	void displayCation(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
	// ����� �޾ұ⶧���� �� ������ smarTv�� ������ �ְ� �ȴ�.
	//	boolean power; 
	//	int channel;
	//	
	//	void power() {
	//		power = !power;
	//	}
	//	void channelUp() {
	//		++channel;
	//	}
	//	void channelDown(){
	//		--channel;
	//	}
	
}

public class Chap7_1 {
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel=10;			//��ӹ��� ���
		stv.channelUp();		//��ӹ��� ���
		
		System.out.println("���� ä����? "+stv.channel +"��");
		stv.displayCation("hi~~~"); //�ڸ����Ѽ� �ȳ���.
		stv.caption=true; // �ڸ�Ŵ.
		stv.displayCation("hi~~~");
		
		stv.channelDown();
		stv.channelDown();
		stv.channelDown(); 
		System.out.println("���� ä����? "+stv.channel +"��");

		String result = "";
		for(int j=1; j<10; j++) {
			result+=1+"*"+j+"="+ 1*j;
		}
		System.out.println(result);		
		
		
		
	}

}
