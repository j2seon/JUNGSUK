package chap6;


class Car {
	String color ;
	String gearType;
	int door;
	
	Car(){ //디폴드 값이 생긴다. 
		this("흰색","2종",4); // 생성자를 호출하는 방식을 이용한다.
	}
	//lv와 iv 구분을 위해 this 를 사용 
	Car(String color,String gearType,int door){
		this.color = color;
		this.gearType=gearType;
		this.door=door;
	}
	
}




public class EX6_4 {
	public static void main(String[] args) {
		//코드의 중복을 제거하기 위함. 생성자!
		
	}

}
