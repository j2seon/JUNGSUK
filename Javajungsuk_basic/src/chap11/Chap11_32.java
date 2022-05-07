package chap11;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Chap11_32 {
	
	static HashMap<String, HashMap<String, String>> phonebook = new HashMap();
	
	//���ο� �׷� �߰��ϴ� �޼ҵ�
	static void addGroup(String groupName) {
		if(!phonebook.containsKey(groupName)) 
			phonebook.put(groupName, new HashMap<String, String>());
	}
	
	static void addPhonNo(String groupName,String name,String tel){
		addGroup(groupName);//�׷��� �߰��ϸ� 
		HashMap<String ,String> group = phonebook.get(groupName); //�׷��� �߰��� value ���� ������ �ͼ� group������ ��´�. ���� valuer���� hashmap�� ������!!!
		group.put(tel, name); // �̸��� ��ĥ���� ������ �ڵ�����ȣ�� key������ �д�.
	}
	static void addPhonNo(String name, String tel) { //�����ε��� �̿��ؼ� ! �⺻������ ����
		addPhonNo("��Ÿ", name, tel);
	}
	
	static void prinlist() {
		Set set = phonebook.entrySet();
		Iterator<Set> it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e =(Map.Entry)it.next();
			Set subset = ((HashMap) e.getValue()).entrySet();
			Iterator subit =subset.iterator();
			
			System.out.println("* "+e.getKey()+"["+subset.size()+"]");
			
			while(subit.hasNext()) {
				Map.Entry subE = (Map.Entry)subit.next();
				String telNo = (String) subE.getKey();
				String name = (String) subE.getValue();
				System.out.println(name + " "+telNo);
			}
			System.out.println();
		}
	
	}
	
	public static void main(String[] args) {
		
		addPhonNo("ģ��", "���", "010-1111-1111");
		addPhonNo("ģ��", "�̸�", "010-2222-2222");
		addPhonNo("ȸ��", "����", "010-1234-1234");
		addPhonNo("ȸ��", "�ڸ�", "010-1222-1221");
		addPhonNo("ȸ��", "����", "010-1333-1333");
		addPhonNo("ģ��", "�ָ�", "010-7777-7777");
		
		addPhonNo("dd", "010-0000-0000");
		
		prinlist();
	}

}