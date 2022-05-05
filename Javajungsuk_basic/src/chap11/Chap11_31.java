package chap11;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Chap11_31 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("김자바", 40);
		map.put("박자바", 90);
		map.put("이자바", 80);
		map.put("김자바", 60);
		map.put("강자바", 100);
		map.put("남자바", 90);
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {//Map.Entry 는 key와 value를 나눌수 있게한다!! map의 내부인터페이스!!!  
			Map.Entry e= (Map.Entry)it.next(); 
			System.out.println("이름 : "+e.getKey()+", 점수 :"+e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단 : "+set);
		
		Collection c=map.values();//참가자의 점수를 담음
		it=c.iterator(); //읽기위해서 Iterator 타입에 담음
		int sum=0; //합계변수
		
		while(it.hasNext()) {
			sum+=(Integer) it.next();
		}
		
		System.out.println("참가자의 점수합계는 : "+sum);
		System.out.println("참가자의 평균은 : "+ (double)sum/set.size());
		System.out.println("참가자의 최고점수는 : "+Collections.max(c));
		System.out.println("참가자의 최저점수는 : "+Collections.min(c));

		
		
	}

}
