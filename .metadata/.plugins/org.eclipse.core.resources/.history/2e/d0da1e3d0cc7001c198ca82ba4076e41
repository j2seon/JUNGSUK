package chap6;
//참조형반환타입


class Data2 {
	int x;
}

public class EX6_10 {
	public static void main(String[] args) {
		//먼저 main이 실행된다.
		//Data2 d변수가 만들어지고 애가 가르키는 건 new Data2 의 x 가 된다.
		Data2 d = new Data2();
		d.x = 10; // d가 가르키는 값인 x 의 값을 10으로 바꾼다.
		
		//그리고 d 처럼 d2변수가 만들어지는데 d2에 대입될거는 copy라는 메소드이고 이 메소드에는 d가 대입된다.
		Data2 d2= copy(d);
		
		//copy가 메소드를 통해 만들어진 new Data2()과 같은 것이고 이를 main에서 만들어진 Data2의 d2변수에 대입이 된다.
		// 즉 Data2 d2 = copy에서 만들어진 new Data2()>> 그럼 얘의 x의 값은 10 !!!!
		System.out.println("d.x : "+d.x);
		System.out.println("d2.x : "+d2.x);
	
	}
	static Data2 copy(Data2 e) { //이해를 위해 Data2 변수e로 지정
		//copy가 호출이 되면 Data2 의 temp가 만들어지고 애가 가르키는건 new Data2() x가 된다.
		Data2 temp = new Data2();
		
		//그래서 temp가 가르키는 x의 값이 Date2의 e변수가가르키는 x의 값인데. e라는 변수에는 d의 값이 들어가서 Data2 e = d 라서 얘는 d가 가르키고 있는 x를 본다. 
		//temp가 가르키고 있는 x의 값이 e가 가르키는 x의 값(d.x)이 대입되기때문에 10이 들어가게된다.
		temp.x =e.x;
		
		//그러면 temp가 가르키는 new Data2()를 반환한다!!!
		return temp;
	}
	
	
	
}
