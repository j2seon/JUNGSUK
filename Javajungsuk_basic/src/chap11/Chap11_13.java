package chap11;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Chap11_13 {
	public static void main(String[] args) {
		Set set = new TreeSet(); //범위 검색에 유리하다! from ~ to
		
		for(int i =0; set.size()<6;i++) {
			int num=(int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set); //자동으로 정렬된다. 내부에 정렬 요소가 있기 때문 
		
		Set set1 = new TreeSet();
		
//		
//		for(int i =0; set1.size()<6;i++) {
			set1.add(new Test());
			set1.add(new Test());

//		}
		System.out.println(set1);
		
		Set set2 = new TreeSet(new TestComp());

//		
//		for(int i =0; set2.size()<6;i++) {
//			int num=(int)(Math.random()*45)+1;
			set2.add(new TestComp());
			set2.add(new TestComp());
			set2.add(new TestComp());			
			set2.add(new TestComp());

//		}
		System.out.println(set2);
		
		UpDown u = new UpDown();
		u.updown();
		
		
	}
}
class Test implements Comparable{//비교기준이 없기때문에 예외가 발생한다.(Comparable을 구현하지 않을 시!!! 구현하면 가능해진다.)
	@Override
	public int compareTo(Object o) {
		return -1;
	}}

class TestComp implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		return 1; //0으로 두니까 같은 객체로 인식
					//-1,1로 두니까 다 다른객체로 인식
	}
}

class UpDown{
	public void updown() {
		TreeSet t = new TreeSet();
		int [] score = {80,90,93,20,10,40,30,89};
		for(int i=0; i<score.length; i++) {
			t.add(new Integer(score[i]));
		}
		
		System.out.println("50보다 작은 점수! " + t.headSet(new Integer(50))); //정렬된 상태로 나오게된다.
		System.out.println("50보다 큰 점수 ! "+ t.tailSet(50));
	}
}

