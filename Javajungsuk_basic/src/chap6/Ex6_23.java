package chap6;


public class Ex6_23 {

	static int max(int[]arr) {
		if(arr==null || arr.length==0) {
			return -999999;
		}
		int max=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max)  
				max=arr[i];
				max=max;			
		}
		return max;
	}
	
	
	
	
	
	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("�ִ밪:"+max(data)); 
		System.out.println("�ִ밪 :"+max(null)); 
		System.out.println("�ִ밪 :"+max(new int[]{})); // 0 �ִ밪 ũ�Ⱑ �� �迭
	}

}