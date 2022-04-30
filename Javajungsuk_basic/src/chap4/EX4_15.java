package chap4;

import java.util.Scanner;

public class EX4_15 {
	public static void main(String[] args) {
		int answer =0, input=0; // 랜덤한 숫자 넣을 변수 랑 스캐너로 읽을 변수 선언
		
		answer= (int)(Math.random()*100)+1; // 1~100까지의 랜덤한 정수를 저장!!! (int)로 형변환했다.
		Scanner scanner = new Scanner(System.in);
		//do while 문 밖에 선언함으로써 메인메소드 내에서 받은 값이 전체에 반영될 수 있도록
		//만약 해당 변수들이 do while문 밖에 선언된다면 do while문 안에서만 범위를 가지게 된다.
		
		 
		do {
			System.out.print("1~100까지의 정수를 입력하세요!!>>>> ");
			input = scanner.nextInt();
			
			if(input>answer) {
				System.out.println(input + "보다 작은 수를 입력하세요!");
			}else if(input<answer) {
				System.out.println(input+"보다 큰수를 입력하세요!");
			}
		}while(input!=answer); //넣은 값이랑 랜덤한 값이랑 같지 않을때는 계속 반복!
		System.out.println("정답입니다 답은 : "+ answer );
		
	}

}
