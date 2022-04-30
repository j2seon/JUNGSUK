package chap6;

public class chap6_22 {
	public static void main(String[] args) {
		//가변인자
		//String ...args 는 내부적으로 배열을 이용하는 것이다. 배열이 생성되는 것!  
		//의문? 매개변수를 배열로 받으면 되지 않나? >> 매개변수를 배열로 지정할 경우 값을 넣어줘야한다. null 또는 new String[1]이런식으로
		//가변인자의 경우 호출될때 배열이 새로 생성되는것!!!
		
		String []str = {"100","200","300"};
		System.out.println(concatenate("-", str)); 
		System.out.println(concatenate("", new String [] {"1","2","3"}));
		
	}

	
	static String concatenate(String a, String...args) {
		String result="";
		
		for(String str : args) {
			result+=str+a;
		}
		return result;
	}
	
	static String concatenate(String...args) {
		return concatenate("", args);
		
	}
	
}

