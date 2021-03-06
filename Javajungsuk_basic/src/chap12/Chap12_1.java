package chap12;

import java.util.ArrayList;

interface Eatable{}

class box<T>{
	ArrayList<T>list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString();}	
}

class Fruitbox<T extends Fruit & Eatable> extends box{}

class Fruit implements Eatable{public String toString() {return "Fruit";}}
class Apple extends Fruit {public String toString() {return "Apple";}}
class Grape extends Fruit {public String toString() {return "Grape";}}
class toy {} 

public class Chap12_1 {
	public static void main(String[] args) {
		Fruitbox<Fruit> fruitbox =  new Fruitbox<Fruit>();
		Fruitbox<Apple> applebox = new Fruitbox<Apple>();
		Fruitbox<Grape> grapebox = new Fruitbox<Grape>();
		//Fruitbox<Fruit> grapebox = new Fruitbox<Grape>(); 타입불일치
		//Fruitbox<toy> toy = new Fruitbox<toy>();에러
		
		fruitbox.add(new Fruit());
		fruitbox.add(new Apple());
		fruitbox.add(new Grape());
		applebox.add(new Apple());
		
		
		
	}

}
