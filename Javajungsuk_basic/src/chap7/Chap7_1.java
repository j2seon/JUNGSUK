package chap7;

class Tv{
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

class SmartTv extends Tv{
	boolean caption;
	void displayCation(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
	// 상속을 받았기때문에 이 값들을 smarTv도 가지고 있게 된다.
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
		stv.channel=10;			//상속받은 멤버
		stv.channelUp();		//상속받은 멤버
		
		System.out.println("현재 채널은? "+stv.channel +"번");
		stv.displayCation("hi~~~"); //자막안켜서 안나옴.
		stv.caption=true; // 자막킴.
		stv.displayCation("hi~~~");
		
		stv.channelDown();
		stv.channelDown();
		stv.channelDown(); 
		System.out.println("현재 채널은? "+stv.channel +"번");

		String result = "";
		for(int j=1; j<10; j++) {
			result+=1+"*"+j+"="+ 1*j;
		}
		System.out.println(result);		
		
		
		
	}

}
