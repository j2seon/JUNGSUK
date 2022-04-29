package chap5;



//배열은 같은 타입의 변수를 묶은 것
//참조변수임!! 따라서 변수가 값을 가지고 있는게 아니라 자리값을 가지고 있다.
//인덱스 길이는 배열의 길이-1이다

public class Ex5_1 {
	public static void main(String[] args) {
		int [] score = new int[5]; //배열의 길이가 5 인덱스는????4 (0,1,2,3,4)
		int k =1;
		
		score[0]=50;
		score[1]=60;
		score[k+1]=60;
		score[3]=80;
		score[4]=90;
		//score[5]=60; 범위를 벗어나니 오류이다.
		int temp=score[k+2]+score[4];
		
		//출력하기 
		for(int i=0; i<score.length;i++)
			System.out.printf("score[%d] : %d%n",i,score[i]);
		
		System.out.printf("temp = %d%n",temp);
	}

}
