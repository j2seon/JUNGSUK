package chap5;



//�迭�� ���� Ÿ���� ������ ���� ��
//����������!! ���� ������ ���� ������ �ִ°� �ƴ϶� �ڸ����� ������ �ִ�.
//�ε��� ���̴� �迭�� ����-1�̴�

public class Ex5_1 {
	public static void main(String[] args) {
		int [] score = new int[5]; //�迭�� ���̰� 5 �ε�����????4 (0,1,2,3,4)
		int k =1;
		
		score[0]=50;
		score[1]=60;
		score[k+1]=60;
		score[3]=80;
		score[4]=90;
		//score[5]=60; ������ ����� �����̴�.
		int temp=score[k+2]+score[4];
		
		//����ϱ� 
		for(int i=0; i<score.length;i++)
			System.out.printf("score[%d] : %d%n",i,score[i]);
		
		System.out.printf("temp = %d%n",temp);
	}

}
