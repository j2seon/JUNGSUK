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
		
		
		//Character.isDigit()�� �̿��ص� �ɵ��ϴ�.
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
		System.out.println(str+"�� �����Դϱ�?"+isNumber(str)); 
		str = "1234o";
		System.out.println(str+"�� �����Դϱ�?"+isNumber(str)); 
		
		
		
	}

}