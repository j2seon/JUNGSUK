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
			System.out.println("id�� �н����带 �Է��ϼ��� ");
			System.out.println("id : ");
			String id = scanner.nextLine().trim();
			System.out.println("password : ");
			String password =scanner.nextLine().trim();
			
			
			if(!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�");
				continue;
			}
			
			if(!(map.get(id)).equals(password)) {
				System.out.println("�Է��Ͻ� ��й�ȣ�� ��ġ���� �ʽ��ϴ� �ٽ��Է����ּ���");
				continue;
			}else {
				System.out.println("����!");
				break; //�����߱⶧���� �ݺ����� ������������ 
			}
		}
		
		
	}

}
