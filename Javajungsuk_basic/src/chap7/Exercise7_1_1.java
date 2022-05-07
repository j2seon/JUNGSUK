package chap7;

import java.util.Scanner;

class Card{
	final int NUM;
	final boolean IS_KWANG;	
	
	public Card(int num, boolean iskwang) {
		this.NUM=num;
		this.IS_KWANG=iskwang;
	}
	public Card() {
		this(1,true);
	}
	@Override
	public String toString() {
		return NUM+(IS_KWANG? "K":"");
	}
}



public class Exercise7_1_1 {

	static Scanner scanner = new Scanner(System.in);
	
	class Deck{
		final int CARD_NUM = scanner.nextInt();
		Card[] deck = new Card[CARD_NUM];
		
		Deck() {
			for(int i=0; i<deck.length; i++) {
				int num=i%10+1;
				boolean isKwang = (i>10)&&(num==2||num==4||num==6||num==8);
				
				deck[i]= new Card(num, isKwang);
			}
		}
		
	
	}
	public static void main(String[] args) {

	}

}
