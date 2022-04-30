package chap7;

public class Chap7_3 {
	public static void main(String[] args) {
		Deck d = new Deck(); //ī�� ������ �����
		Card1 c = d.pick(0); //ī�带 ���� ���� �� ������ �̴´� >>Ŭ�ι� 1 �� �����Ǿ�����
		System.out.println(c);
		d.shuffle(); //ī�带 ���´�.
		c=d.pick(0);
		System.out.println(c);
		

		
		
	}

}

class Deck{
	final int CARD_NUM=52; //ī�尳��
	Card1 cardArr[] = new Card1[CARD_NUM]; //ī�并���̵�
	
	//deck ������ ȣ��� ī�尡 ��!
	public Deck() {
		int n=0;//�迭�� �� ���ڸ� ���� ����
		//4���� ������ 13���� �ֵ��� ���� �־�����Ѵ�!!!
		for(int i=Card1.KIND_MAX; i>0; i-- ) { //i�� �ִ� ������ 4�϶� 0�̵ɶ����� �ݺ�! 
			for(int j=0; j<Card1.NUM_MAX; j++) { //j�� ���������� 13���� �־���ϴϱ� !!!
				cardArr[n++]=new Card1(i, j+1); //ī��迭�� ī������(����,��ȣ)�� ���ߵǼ� new Card�� �־��ֱ� j�� 1���͵����ؼ� +1���ذ�
			}									//�ƴϸ� j=1�� �ΰ� j<=	Card1.NUM_MAX�ص��ɵ�
		}
	}
	
	//ī�带 �̴� �޼���
	Card1 pick(int index) {//������ ��ġ�� ���� ������ ����.
		return cardArr[index];
	}
	
	Card1 pick() {//ī���ϳ��� ���� �ƹ�����
		int index=(int)(Math.random()*CARD_NUM);
		return pick(index);
	}
	
	/* �̷��� �޼ҵ带 ������ ��� �迭�� ��ȭ�� ��� �������� �ƹ����� �������ϴµ� ���� ���ϴ� ��ġ�� ī��� �������� ����.
	Card1 pick() {
		int index = (int)(Math.random()*CARD_NUM);
		return cardArr[index];
	}
	*/
	
	//ī�� ����
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
	static final int KIND_MAX=4; //ī�� ����
	static final int NUM_MAX=13; //ī�� ������ ��ȣ
	
	static final int SPADE =4; //������
	static final int DIAMOND =3;
	static final int HEART =2;
	static final int CLOVER =1;
	int kind; //������ ����Ű�� static �� ���� ���� �ν��Ͻ� ����
	int num;
	//static�� �ν��Ͻ� ������ �ü� ��� !
	Card1(){
		this(SPADE, 1); //Card1() ������ ȣ��� ���ο� ī�尴ü��������� �� ī��� spade�� 1 �� ī�带 ���� ��! 
	}
	public Card1(int kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	public String toString() {
		String [] kind= {"","SPADE","DIAMOND","HEART","CLOVER"} ; //kind[0]�� ���� ���� 
		String number = "0123456789XJQK"; //���� 10�� x
		return "kind : "+ kind[this.kind]+" , number : "+number.charAt(this.num);
	}
	
	
}