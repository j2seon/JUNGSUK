package chap12;

import java.util.HashMap;

public class Chap12_test {

	public static void main(String[] args) {
		
		HashMap<String , St> map = new HashMap<>();
		map.put("�ڹ�", new St("�ڹ�", 1, 1, 90, 80, 100));
		
		St s = map.get("�ڹ�"); //����ȯ�� �ʿ����!
		System.out.println(s.ban);//����
		
		
	}

}

class St{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	
	public St(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	
	
}