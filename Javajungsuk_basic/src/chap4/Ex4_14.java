package chap4;

import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		int num =0, sum=0; //숫자 넣을 변수 합계 넣을 변수선언
		System.out.println("숫자를 입력해요! >>");
		Scanner scanner = new Scanner(System.in);
		num=scanner.nextInt();
		
		while(num!=0) {
			sum+=num%10; // 10으로 나눴을 때 나온 나머지의 값을 더함
			System.out.println("sum : "+ sum +" num : "+num);
			
			num=num/10; // 나머지 구하고 10으로 나눔
		}
		System.out.println("전체 자리수의 합 : "+ sum);
		
		System.out.println();
		
		//while 문을 for문으로!
		for(num=1234; num>0; num=num/10) {
			System.out.println(num);
		} 
		
		
		
	}

}
