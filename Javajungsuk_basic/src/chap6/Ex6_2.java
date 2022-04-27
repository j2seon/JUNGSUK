package chap6;
//참조형 매개변수 정리


class Data1{
	int x;
}

public class Ex6_2 {
	public static void main(String[] args) {
		// 메인메소드가 실행된다.
		//Data1의 d가 만들어지고 d 는 new Data1()값을 가진다.new Data1()는 int x를 가진 객체 
		Data1 d = new Data1(); 
		d.x=10;
		//d가 가르키고 있는 x는 객체로 만들어진 new Data1()는 int x를 보고 있고 그 x의 값이 10된다!
		
		System.out.println("main() : x = "+d.x);
		
		
		change(d); // change 메소드가 실행되면 지금 change 메소드 안에 data1 e 가 만들어지고 그 e에 new Data1()를 가르키고 있는 d가 들어간다.
					// 즉 data1 e = d 가 되어서 new Data1()의 x를 보게 되고 메소드내에서 해당 값을 제지정할 시 new Data1()의 x값이 변경된다.
		
		System.out.println("After change(d)");
		System.out.println("main() : x = "+ d.x); //1000
		
		
	}
	static void change(Data1 e) { //이해를 위해 Data1 e로 지정 보통은 Data1 d로 표기되어있다. 위의 d와 메서드 에서의 Data1 d는 다른것!!!! 
		e.x=1000; //대입된 d.x를 보는 것과 같다. 
		System.out.println("change() : x = "+e.x);
	}
	
}
