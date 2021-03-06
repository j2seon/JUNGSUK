package chap11;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Chap11_32 {
	
	static HashMap<String, HashMap<String, String>> phonebook = new HashMap();
	
	//새로운 그룹 추가하는 메소드
	static void addGroup(String groupName) {
		if(!phonebook.containsKey(groupName)) 
			phonebook.put(groupName, new HashMap<String, String>());
	}
	
	static void addPhonNo(String groupName,String name,String tel){
		addGroup(groupName);//그룹을 추가하면 
		HashMap<String ,String> group = phonebook.get(groupName); //그룹을 추가한 value 값을 가지고 와서 group변수에 담는다. 현재 valuer값도 hashmap인 상태임!!!
		group.put(tel, name); // 이름은 겹칠수도 있으니 핸드폰번호를 key값으로 둔다.
	}
	static void addPhonNo(String name, String tel) { //오버로딩을 이용해서 ! 기본값으로 설정
		addPhonNo("기타", name, tel);
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
		
		addPhonNo("친구", "김모씨", "010-1111-1111");
		addPhonNo("친구", "이모씨", "010-2222-2222");
		addPhonNo("회사", "오모씨", "010-1234-1234");
		addPhonNo("회사", "박모씨", "010-1222-1221");
		addPhonNo("회사", "서모씨", "010-1333-1333");
		addPhonNo("친구", "주모씨", "010-7777-7777");
		
		addPhonNo("dd", "010-0000-0000");
		
		prinlist();
	}

}
