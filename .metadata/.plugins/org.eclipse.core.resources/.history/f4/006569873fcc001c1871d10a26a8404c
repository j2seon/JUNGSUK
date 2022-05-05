package chap11;

import java.util.HashMap;
import java.util.Scanner;

public class Chap11_30 {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("myid", "1234");
		map.put("asdf", "1111");
		System.out.println(map);
		map.put("asdf", "1234");
		System.out.println(map);
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 패스워드를 입력하세요 ");
			System.out.println("id : ");
			String id = scanner.nextLine().trim();
			System.out.println("password : ");
			String password =scanner.nextLine().trim();
			
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다");
				continue;
			}
			
			if(!(map.get(id)).equals(password)) {
				System.out.println("입력하신 비밀번호가 일치하지 않습니다 다시입력해주세요");
				continue;
			}else {
				System.out.println("성공!");
				break; //성공했기때문에 반복문을 빠져나가도록 
			}
		}
		
		
	}

}
