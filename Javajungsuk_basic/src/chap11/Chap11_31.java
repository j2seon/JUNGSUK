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
		map.put("���ڹ�", 40);
		map.put("���ڹ�", 90);
		map.put("���ڹ�", 80);
		map.put("���ڹ�", 60);
		map.put("���ڹ�", 100);
		map.put("���ڹ�", 90);
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {//Map.Entry �� key�� value�� ������ �ְ��Ѵ�!! map�� �����������̽�!!!  
			Map.Entry e= (Map.Entry)it.next(); 
			System.out.println("�̸� : "+e.getKey()+", ���� :"+e.getValue());
		}
		
		set = map.keySet();
		System.out.println("������ ��� : "+set);
		
		Collection c=map.values();//�������� ������ ����
		it=c.iterator(); //�б����ؼ� Iterator Ÿ�Կ� ����
		int sum=0; //�հ躯��
		
		while(it.hasNext()) {
			sum+=(Integer) it.next();
		}
		
		System.out.println("�������� �����հ�� : "+sum);
		System.out.println("�������� ����� : "+ (double)sum/set.size());
		System.out.println("�������� �ְ������� : "+Collections.max(c));
		System.out.println("�������� ���������� : "+Collections.min(c));

		
		
	}

}
