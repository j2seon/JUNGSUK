package chap11;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Chap11_13 {
	public static void main(String[] args) {
		Set set = new TreeSet(); //���� �˻��� �����ϴ�! from ~ to
		
		for(int i =0; set.size()<6;i++) {
			int num=(int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set); //�ڵ����� ���ĵȴ�. ���ο� ���� ��Ұ� �ֱ� ���� 
		
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
class Test implements Comparable{//�񱳱����� ���⶧���� ���ܰ� �߻��Ѵ�.(Comparable�� �������� ���� ��!!! �����ϸ� ����������.)
	@Override
	public int compareTo(Object o) {
		return -1;
	}}

class TestComp implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		return 1; //0���� �δϱ� ���� ��ü�� �ν�
					//-1,1�� �δϱ� �� �ٸ���ü�� �ν�
	}
}

class UpDown{
	public void updown() {
		TreeSet t = new TreeSet();
		int [] score = {80,90,93,20,10,40,30,89};
		for(int i=0; i<score.length; i++) {
			t.add(new Integer(score[i]));
		}
		
		System.out.println("50���� ���� ����! " + t.headSet(new Integer(50))); //���ĵ� ���·� �����Եȴ�.
		System.out.println("50���� ū ���� ! "+ t.tailSet(50));
	}
}
