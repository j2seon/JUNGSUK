package chap6;


class Mymath1{
	int add (int a , int b){
		System.out.print("int add(int a, int b) : ");
		return a+b;
	}
	long add(int a , long b) {
		System.out.print("long add (int a, long b) :");
		return a+b;
	}
	long add (long a , int b) {
		System.out.print("long add (long a , int b) : ");
		return a+b;
	}
	long add (long a , long b) {
		System.out.print("long add (long a , long b) : ");
		return a+b;
	}
	
	int add(int[] a) {
		int result =0;
		for(int i =0; i<a.length; i++) {
			result+=a[i];
		}
		return result; 
	}
	
}

public class chap6_21 {
	public static void main(String[] args) {
		
		Mymath1 m = new Mymath1();
		
		System.out.println(m.add(3, 3));
		System.out.println(m.add(3, 3L));
		System.out.println(m.add(3L, 3));
		System.out.println(m.add(3L, 3L));
		
		int a[] = {200,300,400};
		System.out.println(m.add(a));
		
		
	}
}

