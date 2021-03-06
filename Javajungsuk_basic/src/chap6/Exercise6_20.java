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
		 //유효성 검사를 해줘야한다!!!! 어떤 매개변수가 들어올지 모르기때문에 필수적으로 해둬야한다!!! 
		 if(arr==null||arr.length==0) 
			 return arr;
		 
		 
		 //랜덤으로 숫자 부여할 변수 선언하기
		 int num = (int) (Math.random()*10);
		 int temp;//숫자가 담시 담길 변수 선언
		 for(int i=0; i<arr.length; i++) {
			 temp=arr[i];//a[0]의 값을 temp에 담고 
			 arr[i]=arr[num]; //a[0]에는 랜덤으로 오게된 배열의 값이 들어가고
			 arr[num]=temp; 	// 랜듬으로 오게된 배열의 자리에 temp의 값을 넣는다.
		 }
		 return arr;
	}



}
