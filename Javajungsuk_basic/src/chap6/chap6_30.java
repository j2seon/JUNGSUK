package chap6;


class Documents{
	static int count =0;
	String name;
	
	public Documents() { //이름을 미지정한 문서
		this("제목없음"+ ++count); 
	}

	public Documents(String name) {
		this.name = name;
		System.out.println("문서 "+ this.name+" 생성되었습니다.");
	}
}


public class chap6_30 {
	public static void main(String[] args) {
		Documents d1 = new Documents();
		Documents d2 = new Documents();
		Documents d3 = new Documents("자바.txt");
		
		
		
	}

}
