package chap7;

class MyTv2{
	private boolean isPoweron;
	private int channel;
	private int volume;
	private int preChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public boolean isPoweron() {
		return isPoweron;
	}
	public void setPoweron(boolean isPoweron) {
		this.isPoweron = isPoweron;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(channel>MAX_CHANNEL || channel<MIN_CHANNEL)
			return;
		
		preChannel=this.channel; //현재 채널 저장하고
		this.channel = channel; //저장 후에 매개변수로 받은 채널 변경
		
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void gotoPrevChannel() {
		setChannel(preChannel); 
	}
	
}


public class Ex7_1011 {
	public static void main(String[] args) {
		
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		
	}

}
