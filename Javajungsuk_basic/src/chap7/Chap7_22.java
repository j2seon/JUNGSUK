package chap7;

class Products{
	int price, bounsPoint;
	
	Products(int price){
		this.price=price;
		this.bounsPoint=(int)(price/10); //������ 10%�� ���ʽ� �����̴�.
	}
	public Products() {
		price=0;
		bounsPoint=0;
	}
}
class Tv12 extends Products{
	Tv12(){
		super(100); //Tv����
	}

	public String toString() {
		return "Tv";
	}
}
	
class Computer1 extends Products{
	public Computer1() {
		super(200); //����
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
	int money = 1000; //������
	int bounsPoint=0; //���� ����Ʈ
	
	Products[] item= new Products[10]; // �����ڰ� �� ������ �����ϴ� �迭 
	int num =0; //�迭�� ���� ����
	
	//������ ��� �޼ҵ�
	void buy(Products p) {
		if(money<p.price) {
			System.out.println("�ܾ��� �����մϴ�."); return;
		}
		money-=p.price; //�����ϸ� ���� �پ���.
		bounsPoint+=p.bounsPoint; // �����ϸ� ���ʽ� ����Ʈ�� ���δ�.
		item[num++] = p; //������ ������ item �迭�� �����Ѵ�. 
		System.out.println(p+"�� �����߽��ϴ�.");
	}
	void summary(){ //������ ��ǰ�� �� ���̵���!
		int sum =0; //�����հ�
		String list=""; // ��ǰ���
		
		for(int i=0; i<item.length; i++) {
			if(item[i]==null) 
				break;
			sum=item[i].price;
			list+=item[i]+", "; //toString ���� �����س��� �̸��� ���� 
		}
		System.out.println("������ ��ǰ�� : "+list+" �Դϴ�.");
		System.out.println("������ ��ǰ�� �� ������ : "+ sum+ "�� �Դϴ�.");
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
