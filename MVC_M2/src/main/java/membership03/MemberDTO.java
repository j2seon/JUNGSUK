package membership03;

public class MemberDTO {

	//맴버 변수 선언
	private String id;
	private String pass;
	private String name;
	private String regidate;
	private String grade;
	

	//생성자 
	public MemberDTO() {
		System.out.println("DTO 생성완료");
	}
	
	//getter setter
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegidate() {
		return regidate;
	}
	public void setRegidate(String regidate) {
		this.regidate = regidate;
	}
	

	

	
}
