package chap6;

public class Ex6_22 {
	
	static boolean isNumber(String str) {
		/* 
		if(str==null||str=="") 
			return false;
		
 		for(int i=0; i<str.length(); i++) {
 			char a=str.charAt(i);
 			
 			if(a<'0' || a>'9') 
 				return false;
 			
 		}
		return true;
		*/
		
		
		//Character.isDigit()를 이용해도 될듯하다.
		if(str==null||str=="") 
			return false;
		for(int i=0; i<str.length(); i++) {
 			char a=str.charAt(i);
 			if(Character.isDigit(a)==false)
 				return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		String str = "123";
		System.out.println(str+"는 숫자입니까?"+isNumber(str)); 
		str = "1234o";
		System.out.println(str+"는 숫자입니까?"+isNumber(str)); 
		
		
		
	}

}
