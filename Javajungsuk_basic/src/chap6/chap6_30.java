package chap6;


class Documents{
	static int count =0;
	String name;
	
	public Documents() { //�̸��� �������� ����
		this("�������"+ ++count); 
	}

	public Documents(String name) {
		this.name = name;
		System.out.println("���� "+ this.name+" �����Ǿ����ϴ�.");
	}
}


public class chap6_30 {
	public static void main(String[] args) {
		Documents d1 = new Documents();
		Documents d2 = new Documents();
		Documents d3 = new Documents("�ڹ�.txt");
		
		
		
	}

}