package chap6;

public class Exercise6_20 {
	
	public static void main(String[] args) {
	
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));	
		
		System.out.println(java.util.Arrays.toString(original));

	}


	 static int[] shuffle(int[] arr) {
		 //��ȿ�� �˻縦 ������Ѵ�!!!! � �Ű������� ������ �𸣱⶧���� �ʼ������� �ص־��Ѵ�!!! 
		 if(arr==null||arr.length==0) 
			 return arr;
		 
		 
		 //�������� ���� �ο��� ���� �����ϱ�
		 int num = (int) (Math.random()*10);
		 int temp;//���ڰ� ��� ��� ���� ����
		 for(int i=0; i<arr.length; i++) {
			 temp=arr[i];//a[0]�� ���� temp�� ��� 
			 arr[i]=arr[num]; //a[0]���� �������� ���Ե� �迭�� ���� ����
			 arr[num]=temp; 	// �������� ���Ե� �迭�� �ڸ��� temp�� ���� �ִ´�.
		 }
		 return arr;
	}



}