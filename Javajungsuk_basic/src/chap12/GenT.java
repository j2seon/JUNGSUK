package chap12;

import java.util.ArrayList;

class product{}
class Tv extends product{}
class Audio extends product{}

public class GenT {
	public static void main(String[] args) {
		ArrayList<product> prlist =new ArrayList<product>();
		ArrayList<Tv> tvlist =new ArrayList<Tv>();//Tv�� ������ �� �ִ�.
		Tv t = tvlist.get(0);//����ȯ�� �ʿ���Եȴ�!!!!
		
		//ArrayList<product> list2 =new ArrayList<Tv>(); ����
		
		prlist.add(new Tv()); //������
		prlist.add(new Audio()); 
		
	
		
		
		
	}
}
