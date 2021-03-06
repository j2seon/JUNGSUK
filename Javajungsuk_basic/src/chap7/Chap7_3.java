package chap7;

public class Chap7_3 {
	public static void main(String[] args) {
		Deck d = new Deck(); //카드 뭉탱이 만든다
		Card1 c = d.pick(0); //카드를 섞이 전에 맨 앞장을 뽑는다 >>클로버 1 로 고정되어있음
		System.out.println(c);
		d.shuffle(); //카드를 섞는다.
		c=d.pick(0);
		System.out.println(c);
	}
}

class Deck{
	final int CARD_NUM=52; //카드개수
	Card1 cardArr[] = new Card1[CARD_NUM]; //카드뭉탱이들
	
	//deck 생성자 호출시 카드가 뿅!
	public Deck() {
		int n=0;//배열에 들어갈 숫자를 위해 선언
		//4개의 종류가 13개씩 있도록 숫자 넣어줘야한다!!!
		for(int i=Card1.KIND_MAX; i>0; i-- ) { //i가 최대 종류인 4일때 0이될때까지 반복! 
			for(int j=0; j<Card1.NUM_MAX; j++) { //j가 각종류별로 13개씩 있어야하니까 !!!
				cardArr[n++]=new Card1(i, j+1); //카드배열에 카드형태(종류,번호)로 들어가야되서 new Card로 넣어주기 j는 1부터들어가야해서 +1해준것
			}									//아니면 j=1로 두고 j<=	Card1.NUM_MAX해도될듯
		}
	}
	
	//카드를 뽑는 메서드
	Card1 pick(int index) {//지정된 위치의 값을 꺼낼수 있음.
		return cardArr[index];
	}
	
	Card1 pick() {//카드하나를 고름 아무꺼나
		int index=(int)(Math.random()*CARD_NUM);
		return pick(index);
	}
	
	/* 이렇게 메소드를 정의할 경우 배열의 변화가 없어도 랜덤으로 아무꺼나 고르긴하는데 내가 원하는 위치의 카드는 꺼낼수가 없다.
	Card1 pick() {
		int index = (int)(Math.random()*CARD_NUM);
		return cardArr[index];
	}
	*/
	
	//카드 셔플
	void shuffle() {
		for(int i=0; i<cardArr.length; i++) {
			int n=(int)(Math.random()*CARD_NUM);
			Card1 c= cardArr[i];
			cardArr[i]=cardArr[n];
			cardArr[n]=c;
		}
	}
	
	
}
class Card1{
	static final int KIND_MAX=4; //카드 종류
	static final int NUM_MAX=13; //카드 종류별 번호
	
	static final int SPADE =4; //종류들
	static final int DIAMOND =3;
	static final int HEART =2;
	static final int CLOVER =1;
	int kind; //종류를 가르키는 static 의 값을 받을 인스턴스 변수
	int num;
	//static은 인스턴스 변수로 올수 없어서 !
	Card1(){
		this(SPADE, 1); //Card1() 생성자 호출시 새로운 카드객체만들어지고 그 카드는 spade의 1 번 카드를 가진 것! 
	}
	public Card1(int kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	public String toString() {
		String [] kind= {"","SPADE","DIAMOND","HEART","CLOVER"} ; //kind[0]은 값이 없게 
		String number = "0123456789XJQK"; //숫자 10은 x
		return "kind : "+ kind[this.kind]+" , number : "+number.charAt(this.num);
	}
	
	
}
