package chap7;


class Car_1{
	String color;
	int door;
	
	void drive() {
		System.out.println("�θ��θ�");
	}
	void stop() {
		System.out.println("stop!");
	} 
}

class FireEngine extends Car_1{
	void water() { //���θ��� ���
		System.out.println("water!");
	}
} 

public class Chap7_15 {
	public static void main(String[] args) {
		
		Car_1 c = null;
		FireEngine f1 = new FireEngine();
		FireEngine f2=null;
		
		f1.water();
		c=f1; // c=(Car)f1;
//		c.water(); �Ұ��� 
		f2=(FireEngine)c; // �ٿ�ĳ�����̶� ���������Ѵ� ! �ް����� �׳� �Ѵ� �����鼭 �ͼ�������!
		f2.water();
		
		//===================================================================================
		
		Car_1 cc1= new Car_1();
		Car_1 cc2 = null;
		FireEngine ff =null;
		
//		ff=(FireEngine)cc1; //�������� ����!
		
//		cc2=ff; //�������� ���� but ������ null
//		cc2.drive();//�������� ���� but ������ null
		
		
		
	}

}
