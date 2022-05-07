package chap11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Chap11_34 {
	
	
	public static void main(String[] args) {
		String[] data = {"A","K","A","K","D","K","A","K","K","K","Z","D"};

		TreeMap map = new TreeMap();
		
		for(int i=0; i<data.length; i++) {
			if(map.containsKey(data[i])) {
				Integer value = (Integer) map.get(data[i]);
				map.put(data[i], new Integer(value.intValue()+1));
			}else {
				map.put(data[i], new Integer(1));
			}
		} 
		Iterator it = map.entrySet().iterator();
		
		System.out.println("기본정렬");
		while(it.hasNext()) {
			Map.Entry e = (Entry) it.next();
			int value = ((Integer)e.getValue()).intValue();
			System.out.println(e.getKey() + " : "+PrintBar('*', value)+ value);
		}
		System.out.println();
		
		Set set = map.entrySet();
		List list = new ArrayList(set); //arryalist 타입 내부에 set의 객체들이 배열로 담겼다.
		Collections.sort(list,new ValueComparator());
		
		it=list.iterator();
		
		System.out.println("값의 크기로 정렬 ");
		while(it.hasNext()) {
			Map.Entry e = (Entry) it.next();
			int value = ((Integer)e.getValue()).intValue();
			System.out.println(e.getKey() + " : "+PrintBar('*', value)+ value);
		}
		
		
		
	}
	static class ValueComparator implements Comparator{
		public int compare(Object o1, Object o2) {
			if(o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
				Map.Entry e1 = (Map.Entry)o1;
				Map.Entry e2 = (Map.Entry)o2;
				
				int v1 = ((Integer)e1.getValue()).intValue();
				int v2 = ((Integer)e2.getValue()).intValue();
				
				return v2-v1;
			} 
			return -1;
		}
		
	}
	public static String PrintBar(char ch, int value) {
		char[] bar = new char[value];
		for(int i=0; i<bar.length; i++) {
			bar[i]=ch;
		}
		return new String(bar);
	}
	
	

}
