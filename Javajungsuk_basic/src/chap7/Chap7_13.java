package chap7;

class Time{
	private int hour, minute, second; //외부에서 변경할 수 없도록 지정

	//개터세터를 이용해서 생성자로 시간정하기
	public Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour() {return hour;}
	public void setHour(int hour) { // 조건주어주기 조건이 없다면 시간을 100해도 값이 들어가게되니까!!!
		if(hour<0||hour>23) return;
		this.hour = hour;
	}
	public int getMinute() {return minute;}
	public void setMinute(int minute) {
		if(minute<0||minute>59) return;
		this.minute = minute;
	}
	public int getSecond() {return second;}
	public void setSecond(int second) {
		if(second<0||second>59) return;
		this.second = second;
	}
	@Override
	public String toString() {
		return hour+" : "+minute+ " : "+second;
	}
}
public class Chap7_13 {
	public static void main(String[] args) {
		Time t = new Time(12, 12, 12);
		System.out.println(t);
		//t.hour=3; 불가능 ! >> private 제어자니까!!
		t.setHour(3);
		System.out.println(t);
		
		t.setHour(t.getHour()+1);
		System.out.println(t);
		
		
		
		
	}

}
