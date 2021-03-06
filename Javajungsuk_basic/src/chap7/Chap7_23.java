package chap7;

import java.util.*;

//vector 사용
class Products1{
	int price, bounsPoint;
	
	Products1(int price){
		this.price=price;
		this.bounsPoint=(int)(price/10); //가격의 10%가 보너스 가격이다.
	}
	public Products1() {
		price=0;
		bounsPoint=0;
	}
}
class Tvs extends Products1{
	Tvs(){
		super(100); //Tv가격
	}

	public String toString() {
		return "Tv";
	}
}
	
class Computers extends Products1{
	public Computers() {
		super(200); //가격
	}

	public String toString() {
		return "Computer";
	}
}

class Golds extends Products1{
	public Golds() {
		super(500);
	}
	public String toString() {
		return "gold";
	}
}
class Buyers{
	int money = 1000; //가진돈
	int bounsPoint=0; //가진 포인트
	
	Vector<Products1> item =new Vector(); 
 	
	//물건을 사는 메소드
	void buy(Products1 p) {
		if(money<p.price) {
			System.out.println("잔액이 부족합니다."); return;
		}
		money-=p.price; //구매하면 돈이 줄어든다.
		bounsPoint+=p.bounsPoint; // 구매하면 보너스 포인트가 쌓인다.
		item.add(p);
		System.out.println(p+"를 구매했습니다.");
	}
	//물건을 환불!!
	void refund(Products1 p) {
		if(item.remove(p)) {
			money+=p.price;
			bounsPoint-=p.bounsPoint;
			System.out.println(p+"를 반품하셨습니다.");
		}else {
			System.out.println("구입하신 제품이 없습니다.");
		}
	}
	void summary(){ //구매한 물품이 다 보이도록!
		int sum =0; //가격합계
		String list=""; // 상품목록
		
		if(item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		for(int i=0; i<item.size(); i++) {
			Products1 p=item.get(i);
			sum+=p.price;
			list+= (i==0)? ""+p : ","+p;
		}
		System.out.println("구매한 물품은 : "+list+" 입니다.");
		System.out.println("구매한 물품의 총 가격은 : "+ sum+ "만원 입니다.");
	}
}

public class Chap7_23 {

	public static void main(String[] args) {
		Buyers b= new Buyers();
		Tvs t= new Tvs();
		Computers c= new Computers();
		Golds g = new Golds();
		b.buy(c);
		b.buy(t);
		b.buy(g);
		b.summary();
		
		b.refund(g);
		b.summary();
	}

}
