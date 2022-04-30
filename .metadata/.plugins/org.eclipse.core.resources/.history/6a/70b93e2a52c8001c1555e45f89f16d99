package chap6;

public class Ex6_12 {
	public static void main(String[] args) {
		
		int [] arr= new int[] {3,2,1,6,5,4};
		printArr(arr);
		sortArr(arr);
		printArr(arr);
		System.out.println("sum : "+sumArr(arr));
		
	}
	//향상된 for 문을 이용해해서 배열을 출력하는 메소드	
	static void printArr(int[] arr) {
		System.out.print("[");
		
		for(int i : arr) 
			System.out.print(i+",");
		
		System.out.print("]");
	}
	//총합구하기 
	static int sumArr(int [] arr) {
		int sum=0;
		
		for(int i=0; i<arr.length; i++) 
			sum+=arr[i];
		
		return sum;
	}
	//오름차순 : 참조변수를 매개변수로 받았음!! 이 메소드가 실시될때 int[] arr = arr가 되어서 메소드의 arr에 main의 배열을 바라보고 있는 arr의 주소가 담긴거다.
	static void sortArr(int [] arr) {						//따라서 main의 arr의 배열을 쳐다보고 그 배열의 숫자를 오름차순해버린것!
		for(int i =0; i<arr.length; i++) 					//그래서 해당 메소드가 실시되기 전과 후의 값이 다르게나온다!!!
			for(int j=0; j<arr.length-1; j++)
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
	}
	

}
