package chap11;

import java.util.HashSet;
import java.util.Iterator;

public class Ex11_12 {
	public static void main(String[] args) {
		HashSet setA =new HashSet();
		HashSet setB =new HashSet();
		HashSet sethab =new HashSet();
		HashSet setkyo =new HashSet();
		HashSet setcha =new HashSet();
		
		setA.add("1"); setA.add("2");setA.add("3");setA.add("4");setA.add("5");
		System.out.println("A : "+setA);
		
		setB.add("4"); setB.add("5");setB.add("6");setB.add("7");setB.add("8");
		System.out.println("B : "+setB);
		
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next(); // setB�� ���� tmp�� �����ϴµ� 
			if(setA.contains(tmp)) //�� ���� setA�� ���� ��������� setkyo�� �����Ѵ�. (������ ���ϱ�)
				setkyo.add(tmp);
		}
		it= setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp))
				setcha.add(tmp);
		}
		
		it= setB.iterator();
		while(it.hasNext())
			sethab.add(it.next());
		
		it= setA.iterator();
		while(it.hasNext())
			sethab.add(it.next());
		

		//������ ����
//		setA.retainAll(setB); //����� ��Ҹ� ����� ���� 
		System.out.println(setA);
		
		//������
//		setA.addAll(setB); //
		System.out.println(setA);
		
		//������
		setA.removeAll(setB); //
		System.out.println(setA);
		
		System.out.println("������ : " + setkyo);
		System.out.println("������ : "+ sethab);
		System.out.println("������ : "+ setcha);
		
		
		
		
	}

}