package chap7;

class Product{
	int price, bounsPoint;
	
	Product(int price){
		this.price=price;
		this.bounsPoint=(int)(price/10); //������ 10%�� ���ʽ� �����̴�.
	}
}

class Tv11 extends Product{
	Tv11(){
		super(100); //Tv����
	}

	public String toString() {
		return "Tv";
	}
	
}
	
class Computer extends Product{
	public Computer() {
		super(200); //����
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
	int money = 1000; //������
	int bounsPoint=0; //���� ����Ʈ
	
	//������ ��� �޼ҵ�
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("�ܾ��� �����մϴ�."); return;
		}
		money-=p.price; //�����ϸ� ���� �پ���.
		bounsPoint+=p.bounsPoint; // �����ϸ� ���ʽ� ����Ʈ�� ���δ�.
		System.out.println(p+"�� �����߽��ϴ�.");
	}
}

public class Chap7_21 {
	public static void main(String[] args) {
		Buyer b1 = new Buyer(); //������ 1�� ����
		
		b1.buy(new Tv11()); //Ƽ���!
		System.out.println("���� ���� �ݾ��� : "+ b1.money+ "���� �Դϴ�.");
		System.out.println("���� ���ʽ�����Ʈ�� "+b1.bounsPoint+"point �Դϴ�.");
		b1.buy(new Computer());
		System.out.println("���� ���� �ݾ��� : "+ b1.money+ "���� �Դϴ�.");
		System.out.println("���� ���ʽ�����Ʈ�� "+b1.bounsPoint+"point �Դϴ�.");
		
		b1.buy(new Gold());
		
	}

}