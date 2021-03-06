package chap7;

class Product{
	int price, bounsPoint;
	
	Product(int price){
		this.price=price;
		this.bounsPoint=(int)(price/10); //가격의 10%가 보너스 가격이다.
	}
}

class Tv11 extends Product{
	Tv11(){
		super(100); //Tv가격
	}

	public String toString() {
		return "Tv";
	}
	
}
	
class Computer extends Product{
	public Computer() {
		super(200); //가격
	}

	public String toString() {
		return "Computer";
	}
}

class Gold extends Product{
	public Gold() {
		super(1000);
	}
	public String toString() {
		return "gold";
	}
}

class Buyer{
	int money = 1000; //가진돈
	int bounsPoint=0; //가진 포인트
	
	//물건을 사는 메소드
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족합니다."); return;
		}
		money-=p.price; //구매하면 돈이 줄어든다.
		bounsPoint+=p.bounsPoint; // 구매하면 보너스 포인트가 쌓인다.
		System.out.println(p+"를 구매했습니다.");
	}
}

public class Chap7_21 {
	public static void main(String[] args) {
		Buyer b1 = new Buyer(); //구매자 1명 생성
		
		b1.buy(new Tv11()); //티비삼!
		System.out.println("현재 남은 금액은 : "+ b1.money+ "만원 입니다.");
		System.out.println("현재 보너스포인트는 "+b1.bounsPoint+"point 입니다.");
		b1.buy(new Computer());
		System.out.println("현재 남은 금액은 : "+ b1.money+ "만원 입니다.");
		System.out.println("현재 보너스포인트는 "+b1.bounsPoint+"point 입니다.");
		
		b1.buy(new Gold());
		
	}

}
