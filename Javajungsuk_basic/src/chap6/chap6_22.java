package chap6;

public class chap6_22 {
	public static void main(String[] args) {
		//��������
		//String ...args �� ���������� �迭�� �̿��ϴ� ���̴�. �迭�� �����Ǵ� ��!  
		//�ǹ�? �Ű������� �迭�� ������ ���� �ʳ�? >> �Ű������� �迭�� ������ ��� ���� �־�����Ѵ�. null �Ǵ� new String[1]�̷�������
		//���������� ��� ȣ��ɶ� �迭�� ���� �����Ǵ°�!!!
		
		String []str = {"100","200","300"};
		System.out.println(concatenate("-", str)); 
		System.out.println(concatenate("", new String [] {"1","2","3"}));
		
	}

	
	static String concatenate(String a, String...args) {
		String result="";
		
		for(String str : args) {
			result+=str+a;
		}
		return result;
	}
	
	static String concatenate(String...args) {
		return concatenate("", args);
		
	}
	
}
