package chap7;

public class Chap7_17 {
	public static void main(String[] args) {
		
		FireEngine1 fe = new FireEngine1(); 
		
		if(fe instanceof FireEngine1) //가능
			System.out.println("This is FireEngine1 instance ");
		
		if(fe instanceof Car4)//가능
			System.out.println("This is Car4 instatnce");
		
		if(fe instanceof Object)//가능
			System.out.println("This is Object instance`");
		
		System.out.println(fe.getClass().getName());
		
		
	}

}
class Car4{}
class FireEngine1 extends Car4{}
