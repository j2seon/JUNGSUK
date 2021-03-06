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
			Object tmp = it.next(); // setB의 값을 tmp에 저장하는데 
			if(setA.contains(tmp)) //그 값이 setA의 값에 들어있으면 setkyo에 저장한다. (교집합 구하기)
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
		

		//교집합 쉽게
//		setA.retainAll(setB); //공통된 요소만 남기고 삭제 
		System.out.println(setA);
		
		//합집합
//		setA.addAll(setB); //
		System.out.println(setA);
		
		//차집합
		setA.removeAll(setB); //
		System.out.println(setA);
		
		System.out.println("교집합 : " + setkyo);
		System.out.println("합집합 : "+ sethab);
		System.out.println("차집합 : "+ setcha);
		
		
		
		
	}

}
