package chap6;


class Student{
	String name ;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	int getTotal() {
		return kor+eng+math;
	}
	float getAverage() {
	return (int)(getTotal()/3f*10+0.5)/10f;
	}
	
	String info() {
		return name+","+ban+","+no+","+kor+","+eng+","+math+
				","+getTotal()+","+getAverage();
	}
	
	
	
	/* 	반올림하는 법!
		원하는 값은 78.7!!
		236/3 > 78
		236/3f> 78.666664 실수로 나누면 해당값이 나온다.
		236/3f*10> 786.66664 여기서 0.5를더해준다.
		236/3f*10+0.5>787.16664 여기서 내가원하는건 78.7
		(int)(236 / 3f * 10 + 0.5) (int)787.16664 > 787
(		(int)(236 / 3f * 10 + 0.5) / 10 >>78
(		(int)(236 / 3f * 10 + 0.5) / 10f >> 78.7
		
	*/
	
}

public class Exercise6_3_4_5 {
	public static void main(String[] args) {
		Student s = new Student("홍길동",1,1,100,60,76); 
		
		System.out.println(s.info());
	}

}
