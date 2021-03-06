package chap7;

public class Exercise7_1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
		System.out.println();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
		System.out.println();
		
		System.out.println(deck.pick(0));
	}
	

}

class SutdaDeck{
	final int CARD_NUM=20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	/*
	SutdaDeck() {
		for(int i=0;i<cards.length; i++) {
		int num= i%10+1;
		boolean isKwang = false;
		if(i<10) {
			if(num==1||num==3||num==8) {
				isKwang=true;
			}
		}
		cards[i] = new SutdaCard(num, isKwang);
				
		}
	}*/
	
	SutdaDeck() {
		for(int i=0; i<cards.length; i++) {
			int num=i%10+1;
			boolean isKwang = (i<10)&&(num==1||num==3||num==8);
			
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
	void shuffle() { // 카드의 위치를 섞는다.
		for(int i=0; i<cards.length; i++) {
			int num = (int)(Math.random()*CARD_NUM);
			SutdaCard c=cards[i];
			cards[num]=cards[i];
			cards[num]=c;
		}
	}
	SutdaCard pick(int index) {//유효성 검사를 안했다..
		if(index < 0|| index>=CARD_NUM)
			return null;
		return cards[index];
	}
	
	SutdaCard pick() { 
		int num=(int)(Math.random()*CARD_NUM);
		return cards[num];
	}
}

class SutdaCard{
	final int NUM;
	final boolean ISKWANG;
	public SutdaCard() {
		this(1, true);
	}
	public SutdaCard(int num, boolean isKwang) {
		this.NUM = num;
		this.ISKWANG = isKwang;
	}
	@Override
	public String toString() {
		return NUM+(ISKWANG? "K":"");
	}
	
}