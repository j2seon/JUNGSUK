package chap6;


class Cars{
	int door=5;
	Engine e = new Engine(); //������ �ʱ�ȭ new�� ������������ null ���� �ο��ȴ�. �׳� ���������� �ִ°�.��ü�� �־��ִ� ���� �ʱ�ȭ��!
}

class Engine{}


public class chap6_5 {
	//�����ʱ�ȭ ���Կ������̿�
		static int arr[] = new int[10];
		
		//���� arr�� ������ ���� ä���ְ��;� //�����ʱ�ȭ
		static {
			for (int i=0; i<arr.length ;i++) {
				arr[i]=(int)(Math.random()*10)+1;
			}
		}
		
	public static void main(String[] args) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		
		
		//���������� �����ʱ�ȭ �ؾ��Ѵ�. �޼������ ������ ����Ѱ� �����Ǿ��ٰ� ���������ϱ⶧���� ������ ���ϸ� ȿ���� ��������.
		//1. �ڵ��ʱ�ȭ 0 
		//2. �����ʱ�ȭ =
		//3. �����ʱ�ȭ {},static{}-cv, ������(��������ڷ�)-iv 

	
		//Ŭ���� ����(cv)�� Ŭ������ ó���ε��ɶ� �ʱ�ȭ >���� �Ͼ!!! ���� : cv > iv / �ڵ� > ���� > ����
		//�ν��Ͻ� ����(iv)�� �ν��Ͻ��� �����ɶ����� �ʱ�ȭ�ȴ� Car car= new Car();
		
	}

}