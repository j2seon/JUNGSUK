package chap7;

class Products{
	int price, bounsPoint;
	
	Products(int price){
		this.price=price;
		this.bounsPoint=(int)(price/10); //가격의 10%가 보너스 가격이다.
	}
	public Products() {
		price=0;
		bounsPoint=0;
	}
}
class Tv12 extends Products{
	Tv12(){
		super(100); //Tv가격
	}

	public String toString() {
		return "Tv";
	}
}
	
class Computer1 extends Products{
	public Computer1() {
		super(200); //가격
	}

	public String toString() {
		return "Computer";
	}
}

class Gold1 extends Products{
	public Gold1() {
		super(1000);
	}
	public String toString() {
		return "gold";
	}
}
class Buyer1{
	int money = 1000; //가진돈
	int bounsPoint=0; //가진 포인트
	
	Products[] item= new Products[10]; // 구매자가 산 물건을 저장하는 배열 
	int num =0; //배열에 사용될 숫자
	
	//물건을 사는 메소드
	void buy(Products p) {
		if(money<p.price) {
			System.out.println("잔액이 부족합니다."); return;
		}
		money-=p.price; //구매하면 돈이 줄어든다.
		bounsPoint+=p.bounsPoint; // 구매하면 보너스 포인트가 쌓인다.
		item[num++] = p; //구매한 물건을 item 배열에 저장한다. 
		System.out.println(p+"를 구매했습니다.");
	}
	void summary(){ //구매한 물품이 다 보이도록!
		int sum =0; //가격합계
		String list=""; // 상품목록
		
		for(int i=0; i<item.length; i++) {
			if(item[i]==null) 
				break;
			sum=item[i].price;
			list+=item[i]+", "; //toString 으로 정의해놔서 이름이 나옴 
		}
		System.out.println("구매한 물품은 : "+list+" 입니다.");
		System.out.println("구매한 물품의 총 가격은 : "+ sum+ "원 입니다.");
	}
}

public class Chap7_22 {

	public static void main(String[] args) {
		Buyer1 b1 = new Buyer1();
		b1.buy(new Computer1());
		b1.buy(new Computer1());
		b1.summary();
		
		
		
	}

}
