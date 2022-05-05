package chap12;

import java.util.ArrayList;

class box1<T>{
	ArrayList<T>list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString();}	
}
class Fruitbox1<T extends Fruit1> extends box1<T>{}


class Fruit1 {public String toString() {return "Fruit";}}
class Apple1 extends Fruit1 {public String toString() {return "Apple";}}
class Grape1 extends Fruit1 {public String toString() {return "Grape";}}

class Juice{
	String name;
	public Juice(String name) {this.name=name;}
	@Override
	public String toString() {return name;}
}

class Juicer{
	static Juice makeJuice(Fruitbox1<? extends Fruit1> c) {
		String tmp="";
		return null;
	}
}



public class Chap12_3 {

	public static void main(String[] args) {
		
		
		
		
		
		
		
	}

}
