package chap6;


class Car3{
	String color;
	String gear;
	int door;
	
	Car3() {
		this("red", "auto", 4); //�⺻�����ڸ� ȣ���ϸ� �ش� ������ �ʱ�ȭ�ȴ�.
		
	}

	public Car3(String color, String gear, int door) {
		this.color = color;
		this.gear = gear;
		this.door = door;
	}
	
	Car3(Car3 c){ //������ ���縦 ���� �����ڸ� ����! 
		this(c.color, c.gear, c.door);
		
		/* ���� ������ �ش� �����̶� ���� 
		color=c.color;
		gear=c.gear;
		door=c.door;
		*/
	}
	
}
public class chap6_26 {

	public static void main(String[] args) {
		Car3 c= new Car3(); //"red", "auto", 4�� �ʱ�ȭ �Ǵ� c ȣ��
		
		Car3 c1 = new Car3(c); //c�� ���� ������ c1�� ����.
		
		//���� ���� �������� �Ȱ���!!!
		System.out.println("c : "+c.color+","+c.gear+","+c.door);
		System.out.println("c1 : "+c1.color+","+c1.gear+","+c1.door);
		
		//���⼭ c1�� ���� �������ָ�?
		c1.color="white";
		System.out.println("c : "+c.color+","+c.gear+","+c.door);
		System.out.println("c1 : "+c1.color+","+c1.gear+","+c1.door);
		//c1�� ���� �޶����� Ȯ���� �� �ִ�. >> ��  Car3(Car3 c)�� �����ڷ� ȣ��� �����ڴ� ���������� �����ϴ� �ν��Ͻ���� ��! 
		
		
		
		
		
	}

}