package chap6;

public class Ex6_11 {
	public static void main(String[] args) {
		int x[] = {10}; //ũ�Ⱑ 1�� �迭�� ������� 
		//x�� ũ�Ⱑ 1�� �迭�� �Ĵٺ��Ե�!>�ּ�
		System.out.println("main() : "+x[0] );
		
		
		//�޼ҵ� ȣ�� �ǰ� �׸żҵ忡�� ũ�Ⱑ 1�� �迭�� �ٶ󺸰��ִ� x�� �ּҰ��� 
		change(x);
		System.out.println("after change(x) ");
		//x�� ����Ű�� �迭�� ���� �ٲ���.
		System.out.println("main() : "+ x[0]);
	}
	
	
	static void change(int[] x) {
		x[0]=1000; //���� �ּҰ��� x[0]�� ���� �ٲ�
		System.out.println("change() : "+x[0]);
		
	}
}
