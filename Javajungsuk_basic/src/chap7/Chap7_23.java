package chap7;

import java.util.*;

//vector ���
class Products1{
	int price, bounsPoint;
	
	Products1(int price){
		this.price=price;
		this.bounsPoint=(int)(price/10); //������ 10%�� ���ʽ� �����̴�.
	}
	public Products1() {
		price=0;
		bounsPoint=0;
	}
}
class Tvs extends Products1{
	Tvs(){
		super(100); //Tv����
	}

	public String toString() {
		return "Tv";
	}
}
	
class Computers extends Products1{
	public Computers() {
		super(200); //����
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
	int money = 1000; //������
	int bounsPoint=0; //���� ����Ʈ
	
	Vector<Products1> item =new Vector(); 
 	
	//������ ��� �޼ҵ�
	void buy(Products1 p) {
		if(money<p.price) {
			System.out.println("�ܾ��� �����մϴ�."); return;
		}
		money-=p.price; //�����ϸ� ���� �پ���.
		bounsPoint+=p.bounsPoint; // �����ϸ� ���ʽ� ����Ʈ�� ���δ�.
		item.add(p);
		System.out.println(p+"�� �����߽��ϴ�.");
	}
	//������ ȯ��!!
	void refund(Products1 p) {
		if(item.remove(p)) {
			money+=p.price;
			bounsPoint-=p.bounsPoint;
			System.out.println(p+"�� ��ǰ�ϼ̽��ϴ�.");
		}else {
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
		}
	}
	void summary(){ //������ ��ǰ�� �� ���̵���!
		int sum =0; //�����հ�
		String list=""; // ��ǰ���
		
		if(item.isEmpty()) {
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		
		for(int i=0; i<item.size(); i++) {
			Products1 p=item.get(i);
			sum+=p.price;
			list+= (i==0)? ""+p : ","+p;
		}
		System.out.println("������ ��ǰ�� : "+list+" �Դϴ�.");
		System.out.println("������ ��ǰ�� �� ������ : "+ sum+ "���� �Դϴ�.");
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