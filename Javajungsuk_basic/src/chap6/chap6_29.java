package chap6;


class Product{
	static int count = 0; //������ �ν��Ͻ� ���� ����
	int num; //���� ��ȣ �ο�
	//�� count�� static �ΰ�? >>> �ν��Ͻ� ������ ����� ��� ������ ȣ�⸶�� ���� count�� 0���� �ʱ�ȭ�ȴ� 
	//���� ������ ���� ���� ��� 1 �� ������ �ȴ�. static�� �ν��Ͻ��� static�� ���� �ֱ� ������ 
	//�ش� �ν��Ͻ��� ȣ��� ������ ����Ǵ� �ʱ�ȭ ������ static�� ���� ������Ŵ���ν� count�� ���� ������ �� �ְ� �ȴ�.
	
	
	{// �ν��Ͻ� �ʱ�ȭ!! ����ɶ����� count �� �ϳ��� �÷��ְ� �װ� num�� ����
		++count;
		num=count;
	}

	public Product() {} //��������
	
}
public class chap6_29 {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("��ǰ��ȣ : "+p1.num);
		System.out.println("��ǰ��ȣ : "+p2.num);
		System.out.println("��ǰ��ȣ : "+p3.num);
		System.out.println("�ѻ�ǰ�� ���� : "+Product.count+"���Դϴ�");
		
		
	}

}