package chap12;

import java.util.ArrayList;

class product{}
class Tv extends product{}
class Audio extends product{}

public class GenT {
	public static void main(String[] args) {
		ArrayList<product> prlist =new ArrayList<product>();
		ArrayList<Tv> tvlist =new ArrayList<Tv>();//Tv만 저장할 수 있다.
		Tv t = tvlist.get(0);//형변환이 필요없게된다!!!!
		
		//ArrayList<product> list2 =new ArrayList<Tv>(); 에러
		
		prlist.add(new Tv()); //다형성
		prlist.add(new Audio()); 
		
	
		
		
		
	}
}
