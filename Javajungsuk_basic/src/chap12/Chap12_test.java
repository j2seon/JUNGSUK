package chap12;

import java.util.HashMap;

public class Chap12_test {

	public static void main(String[] args) {
		
		HashMap<String , St> map = new HashMap<>();
		map.put("자바", new St("자바", 1, 1, 90, 80, 100));
		
		St s = map.get("자바"); //형변환이 필요없다!
		System.out.println(s.ban);//가능
		
		
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
