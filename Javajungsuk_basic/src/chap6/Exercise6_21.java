package chap6;

class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff() {
		// (1) isPowerOn true false , false true . 의 값이 면 로 면 로 바꾼다
		if(isPowerOn) {
			isPowerOn=true;
		}else if(!isPowerOn) {
			isPowerOn=false;
		}
	}
	void volumeUp() {
		// (2) volume MAX_VOLUME 1 . 의 값이 보다 작을 때만 값을 증가시킨다
			if(volume<MAX_VOLUME)
				volume++;
		}
		void volumeDown() {
		// (3) volume MIN_VOLUME 1 . 의 값이 보다 클 때만 값을 감소시킨다
			if(MIN_VOLUME<volume) 
				volume--;
		}
		void channelUp() {
			if(channel>=MAX_CHANNEL) {
				channel=MIN_VOLUME;
			}else {
				channel++;
			}
		}
		void channelDown() {
			if(channel<=MIN_CHANNEL) {
				channel=MAX_CHANNEL;
			}else {
				channel--;
			}
		}
}



public class Exercise6_21 {
	public static void main(String[] args) {
		MyTv t = new MyTv();
			t.channel = 100;
			t.volume = 0;
		System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
			t.channelDown();
			t.volumeDown();
		System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
			t.volume = 100;
			t.channelUp();
			t.volumeUp();
		System.out.println("CH:"+t.channel+", VOL:"+ t.volume);

	}

}
