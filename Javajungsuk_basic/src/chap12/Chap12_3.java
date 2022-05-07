package chap12;

import java.util.ArrayList;

class Fruit2 	 			{public String toString() {return "Fruit";}}
class Apple2 extends Fruit2 {public String toString() {return "Apple";}}
class Grape2 extends Fruit2 {public String toString() {return "Grape";}}

class Fruitbox2<T extends Fruit2> extends box2<T>{}

class box2<T>{
	ArrayList<T>list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString();}	
}

class Juice{
	String name;
	public Juice(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}
}

class Juicer{
	static Juice makeJuice(Fruitbox2<? extends Fruit2> fruitbox2) {
		
		
	}
	
}


public class Chap12_3 {
	public static void main(String[] args) {
		
	}

}
