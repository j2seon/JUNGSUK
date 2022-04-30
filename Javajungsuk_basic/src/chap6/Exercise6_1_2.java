package chap6;


class SutdaCard{
	int num;
	boolean isKwang=false;
	
	
	public SutdaCard() {
		this(1, true);
	}


	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info(){
		String k;
		if(isKwang) {
			k="K";
		}else {
			k="";
		}
		
		return num+ k;
		
	}
}

public class Exercise6_1_2 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3,false);
		SutdaCard card2 = new SutdaCard();

		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}
