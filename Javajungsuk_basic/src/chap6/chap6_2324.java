package chap6;


class TData1{
	int value;
}

class TData2{
	int value;
	TData2(int x ){
		value=x;
	}
}

class Car1{
	String color;
	String gear;
	int door;
	
	Car1() {}

	public Car1(String c, String g, int d) {
		color = c;
		gear = g;
		door = d;
	}
	
	
	
}
public class chap6_2324 {
	public static void main(String[] args) {
		TData1 d = new TData1();
		//TData2 dd= new TData2(); ������ ���� �⺻�����ڴ� �Ű������� ���� �����ڸ� ����Ը��� �ڵ� �������� �ʱ⶧����
		
		
		//�Ű������� �ִ� �����ڸ� ����ϰԵǸ� �ڵ尡 ����������. 
		Car1 c =new Car1();
		c.color="white";
		c.door=2;
		c.gear="auto";
		
		Car1 c1 =new Car1("white", "auto", 2);
		//������� ���� 
		System.out.println(c.color+c.gear+c.door);
		System.out.println(c1.color+c1.gear+c.door);
			
				
		
	}
}